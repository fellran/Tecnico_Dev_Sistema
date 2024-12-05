"""
Relações entre classes
Associação - releaciona um objeto a outro
"""

class Usuario:
    def __init__(self,nome,login,senha):
        self.nome = nome
        self.login = login
        self._senha = senha
        self.livro = None
    
    # property chamando o objeto externo e retornando
    # 'pego o objeto e retorno'
    @property
    def livroAdd(self):
        return self.livro
    
    # pega o que foi retornado e acrescenta no atribuito
    @livroAdd.setter
    def livroAdd(self, livroAdd):
        self.livro = (livroAdd)

class Livro:
    def __init__(self,nome,autor):
        self.nome = nome
        self.autor = autor
    
    def mostrarAutor(self):
        return self.autor

user = Usuario('Victor', '089536', 'senha')
book = Livro('1984', 'George Orwell')

user.livro = book
user.livro.mostrarAutor()

print(f'User: {user.__dict__}\nLivro: {book.__dict__}')
print(f'{user.livro}')