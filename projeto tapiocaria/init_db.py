from app import create_app
from models import db

# Cria a aplicação Flask
app = create_app()

# Garantir que estamos no contexto da aplicação ao criar o banco
with app.app_context():
    db.create_all()
    print("Banco de dados criado com sucesso!")
