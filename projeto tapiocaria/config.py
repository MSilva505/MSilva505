# config.py
from flask_sqlalchemy import SQLAlchemy

# config.py

# config.py

# Configuração para conexão MySQL
DB_USERNAME = 'root'      # Nome de usuário do MySQL (ex: 'root')
DB_PASSWORD = ''          # Senha do MySQL (deixe vazio se não houver senha)
DB_HOST = 'localhost'     # Endereço do banco de dados (ex: 'localhost' ou '127.0.0.1')
DB_PORT = '3306'          # Porta padrão do MySQL
DB_NAME = 'cardapio_db'   # Nome do banco de dados

# URI de conexão para SQLAlchemy
SQLALCHEMY_DATABASE_URI = f'mysql+pymysql://{DB_USERNAME}:{DB_PASSWORD}@{DB_HOST}:{DB_PORT}/{DB_NAME}'

# Configuração do SQLAlchemy
SQLALCHEMY_TRACK_MODIFICATIONS = False
