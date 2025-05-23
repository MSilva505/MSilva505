#models.py
from flask_sqlalchemy import SQLAlchemy
from datetime import datetime

db = SQLAlchemy()

class Produto(db.Model):
    __tablename__ = 'produtos'
    id = db.Column(db.Integer, primary_key=True)
    nome = db.Column(db.String(100), nullable=False)
    descricao = db.Column(db.Text, nullable=False)
    preco = db.Column(db.Float, nullable=False)
    categoria = db.Column(db.String(50), nullable=False)
    ingredientes = db.Column(db.Text, nullable=True)
    foto = db.Column(db.LargeBinary, nullable=True)

class Pedido(db.Model):
    __tablename__ = 'pedidos'
    id = db.Column(db.Integer, primary_key=True)
    mesa = db.Column(db.String(10), nullable=False)
    itens = db.Column(db.Text, nullable=False)
    total = db.Column(db.Float, nullable=False)
    data_hora = db.Column(db.DateTime, nullable=False, default=datetime.now)

class Financeiro(db.Model):
    __tablename__ = 'financeiro'
    id = db.Column(db.Integer, primary_key=True)
    tipo_transacao = db.Column(db.String(10), nullable=False)  # entrada ou saída
    metodo_pagamento = db.Column(db.String(20), nullable=False)  # Espécie, Cartão, ou Pix
    valor = db.Column(db.Float, nullable=False)
    descricao = db.Column(db.String(255), nullable=False)
    data_hora = db.Column(db.DateTime, nullable=False, default=datetime.now)
