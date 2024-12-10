# 4)Crie duas classes:
# 1 Autor, com os atributos:  Nome, nacionalidade e livros
# 2 Livro, com os atributos: titulo, ano e autor
# Depois, escreva um programa que:Crie um autor e dois livros associados a ele.
# Imprima o nome do autor e a lista dos seus livros.

class Autor:
    def __init__(self, nome , nacionalidade):
        self.nome = nome
        self.nacionalidade = nacionalidade
        self.livros = []

    def adicionar_livro(self, livro):
        self.livros.append(livro)

    def str(self):
        return f'Autor: {self.nome}({self.nacionalidade})\nLivros: {','.join([livro.titulo for livro in self.livros])}'
    

class Livro:
    def __init__(self, titulo, ano, autor):
        self.titulo = titulo
        self.ano = ano
        self.autor = autor

autor1 = Autor('Fulano', 'Brasileiro')

livro1 = Livro('A revolução dos livros', '1945', autor1)
livro2 = Livro('Notas do subsolo ', '1864',autor1)

autor1.adicionar_livro(livro1)
autor1.adicionar_livro(livro2)

print(autor1.livros)