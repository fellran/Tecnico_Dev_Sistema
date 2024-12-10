# 1)Implemente um sistema de gerenciamento de estoque que inclua classes Produto, Estoque e métodos para adicionar, remover e 
# verificar produtos.  
class Produtos:
    def __init__(self, nome):
        self.nome = nome
        self.estoques = []
    
    def adicionar(self, estoque):
        self.estoques.append(estoque)

    def somarEstoque(self):
        if self.estoques:
            print(f'Total estoque \n{sum(self.estoques)}')

    def removerProduto(self, remover):
        self.remover = remover
        totalEstoque = sum(self.estoques)
        if self.remover > 0:
            result =  totalEstoque - self.remover
            print(result)


        


produto1 = Produtos('camisa')
produto1.adicionar(2)
produto1.adicionar(3)
produto1.adicionar(50)
produto1.somarEstoque()
produto1.removerProduto(3)

# 2)Crie um sistema de gerenciamento de pedidos para um restaurante. Use classes Pedido, ItemPedido e Cardapio


# 3)Crie uma classe Pessoa com os atributos nome e idade. Adicione um método para retornar a data de nascimento.  

# 4)Crie uma classe Aluno que tenha os atributos nome, notas (uma lista) e métodos para calcular a média e verificar se o aluno 
# aprovado (média >= 7). Todo aluno criado deverá ser adicionado a um Json

