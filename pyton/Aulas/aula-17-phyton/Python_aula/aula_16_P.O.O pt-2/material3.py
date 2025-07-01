"""
Agregação 'Forma mais expecializada de associação'
"""

class Loja:
    def __init__(self):
        self.produtos = []

    def inserirProduto(self,*produtos):
        for p in produtos:
            self.produtos.append(p)

    def listaProdutos(self):
        for produto in self.produtos:
            print(produto.nome)
            print(produto.preco)

class Produto:
    def __init__(self,nome,preco):
        self.nome = nome
        self.preco = preco

carrinho = Loja()
p1 = Produto('Relogio do Ben 10', 350)
p2 = Produto('HotWheels', 10)

carrinho.inserirProduto(p1,p2)
carrinho.listaProdutos()
# print(carrinho.__dict__)
