from escpos.printer import Usb

def imprimir_pedido(pedido):
    try:
        # Configuração da impressora USB (ajuste o ID conforme necessário)
        p = Usb(0x04b8, 0x0e15)  # IDs genéricos. Ajuste conforme sua impressora.

        p.text("Tapiocaria Dona Ely\n")
        p.text(f"Pedido Mesa {pedido['mesa']}\n")
        p.text("-" * 32 + "\n")
        for item in pedido['itens']:
            p.text(f"{item['nome']} - R$ {item['preco']:.2f}\n")
        p.text("-" * 32 + "\n")
        p.text(f"Total: R$ {pedido['total']:.2f}\n")
        p.text(f"Pagamento: {pedido['metodo_pagamento']}\n")
        p.text("Obrigado por escolher a Tapiocaria!\n")
        
        p.cut()
    except Exception as e:
        print("Erro ao imprimir pedido:", e)
