agenda = {}

while True:
    nome = input('Digite o nome do usuario >>> ')

    if nome == 'finalizar':
        break

    telefone = input(f'Digite o numero do usuario {nome} >>> ')

    agenda.update({
        nome : telefone
    })

for contatinho in agenda.items():
    print(contatinho)

print(list(agenda.items()))