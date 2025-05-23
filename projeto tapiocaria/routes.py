from flask import render_template, request, jsonify
from models import Produto, Pedido, Financeiro, db
from print_service import imprimir_pedido
from datetime import datetime


def register_routes(app):
    # Página inicial
    @app.route('/')
    def home():
        return render_template('base.html')
    
    # Página de bebidas
    @app.route('/bebidas')
    def bebidas():
        bebidas = Produto.query.filter_by(categoria='Bebidas').all()
        return render_template('bebidas.html', produtos=bebidas)
    
    # Finalizar pedido
    @app.route('/finalizar_pedido', methods=['POST'])
    def finalizar_pedido():
        data = request.json
        mesa = data.get('mesa')
        itens = data.get('itens')
        total = data.get('total')
        metodo_pagamento = data.get('metodo_pagamento')

        # Cria o pedido no banco
        novo_pedido = Pedido(mesa=mesa, itens=str(itens), total=total)
        db.session.add(novo_pedido)

        # Cria registro no financeiro
        registro_financeiro = Financeiro(
            tipo_transacao='entrada',
            metodo_pagamento=metodo_pagamento,
            valor=total,
            descricao=f"Pedido Mesa {mesa}",
            data_hora=datetime.now()
        )
        db.session.add(registro_financeiro)
        db.session.commit()

        # Imprime o pedido
        imprimir_pedido({
            'mesa': mesa,
            'itens': itens,
            'total': total,
            'metodo_pagamento': metodo_pagamento
        })

        return jsonify({'status': 'sucesso', 'mensagem': f'Pedido Mesa {mesa} finalizado com sucesso!'})

    # Página administrativa
    @app.route('/administracao')
    
    def administracao():
        registros = Financeiro.query.all()
        return render_template('administracao.html', registros=registros)

def register_routes(app):
    @app.route('/')
    def home():
        return render_template('base.html')
    
    @app.route('/bebidas')
    def bebidas():
        bebidas = Produto.query.filter_by(categoria='Bebidas').all()
        return render_template('bebidas.html', produtos=bebidas)
    
    @app.route('/finalizar_pedido', methods=['POST'])
    def finalizar_pedido():
        # Lógica da rota final de pedidos
        ...
