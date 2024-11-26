# 1)Encontrar alunos que cursam apenas uma disciplina dado as disciplinas:
# -matematica com os nomes dos alunos que fazem Matemática
# -fisica com os nomes dos alunos que fazem 
# Encontre os alunos que fazem apenas uma das disciplinas.
# matematica = {'Felipe', 'joão', 'Lucas'}
# fisica = {'xande', 'daniel', 'Lucas'}
# materia = set()

# materia = matematica - fisica 

# print(materia)

# 2)Duas lojas possuem estoques diferentes de produtos. Encontre os produtos disponíveis em ambas e os exclusivos de cada loja.
# loja1 = {'nike', 'adidas', 'mizuno'}
# loja2 = {'camisa', 'calca', 'jaqueta', 'nike'}
# conjunto = set()

# conjunto = loja1 & loja2
# print(conjunto)
# conjunto = loja1 - loja2
# print(conjunto)
# conjunto = loja2 - loja1
# print(conjunto)

# 3) Faça o jogo da forca em python utilizando o Set() como base!
palavra_chave = set()

while True:
    palavra = input('Escolha uma letra >>> ')
    palavra_chave.add(palavra.lower())
    if 'p' in palavra_chave:
        print('letra acertada')
        print('p _ _ _ _')
    if 'e' in palavra_chave:
        print('letra acertada')
        print('_ e _ _ _')
    
    if palavra_chave == 'pexe':
        break
