# 1. Cadastro de Produto
# Você precisa criar um programa que armazene informações de um produto em um dicionário. 
# As informações devem incluir nome, preço e quantidade em estoque. Depois,
# o programa deve exibir todas as informações do produto.

# produtos = {
#     # chave  valor
#     'nome' : 'Biscoito',
#     'quantidade' : '5',
#     'estoque' : '60'
# }

# print(produtos)

# 2. Agenda de Contatos
# Crie um programa para armazenar números de telefone. O usuário deve poder adicionar novos contatos
# (nome como chave e número como valor). Depois, o programa deve exibir todos os contatos cadastrados.
# Obs: O salvamento deverá parar apenas quando o usuário digitar "finalizar"

agenda = {
    # chave   valor
    'nome' : 'Felipe',
    'numero' : '12345'
}

cont = 0

while cont != 'finalizar':
    
    cont = input('Deseja Adicionar contatos')
    if cont == 'sim':
        agenda['nome'] = str(input('Digite um nome do contado >>> '))
        agenda['numero'] = str(input('Digite o novo contato >>> '))
        cont = input('Deseja continuar >>> ')
    elif cont == 'finalizar':
        print('Obrigado')


print(agenda)