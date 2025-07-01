# 1) faça uma calculadora com as 4 operações configuradas ( +,-,*,/)

# print('>>> Calculadora <<<')
# print('+ >>> Adicao')
# print('- >>> Subitrçâo')
# print('* >>> Multiplicaçâo')
# print('/ >>> Divisâo')

# number1 = int(input())
# operador = str(input())
# number2 = int(input())

# match operador:
#     case '+':
#         resultado = number1 + number2
#         print(f'{number1} + {number2} = {resultado}')
#     case '-':
#         resultado = number1 - number2
#         print(f'{number1} - {number2} = {resultado}')
#     case '*':
#         resultado = number1 * number2
#         print(f'{number1} * {number2} = {resultado}')
#     case '/':
#         resultado = number1 / number2
#         print(f'{number1} / {number2} = {resultado}')

# 2)Programe um algoritmo onde podemos colocar um valor em reais e logo a pós perguntar qual moeda deseja converter
#  ( Dólares, Ienes ou euro) e logo após isso fazermos a conversão

# print('>>> Conversor de Moedas <<<')
# valor = float(input('Informe o valor em Reais $: '))

# dolar = valor * 5.83
# ienes = valor * 0.038
# euro = valor * 6.08

# print(f'{valor} convertido para Dolar : {dolar}')
# print(f'{valor} convertido para Ienes : {ienes}')
# print(f'{valor} convertido para Euro : {euro}')

# 3)Crie um programa que permita ao usuário adicionar tarefas a uma lista, marcar como concluídas ou remover tarefas

# tarefas = []

# while True:
#     tarefas.append(input('Adicione tarefa >>> '))

#     if len(tarefas) == 3:
#         break

# print(tarefas)

# print(f'A tarefa {tarefas[1]} está concluida ✔')
# print(f'A tarefa {tarefas[2]} foi removida ❌')
# del tarefas[2]
# print(tarefas)

# 4)Implemente uma lojinha virtual simples! Onde possamos ter um catálogo com 5 produtos e nesse podemos adicionar ao carrinho ou
# visualizar-lo. Até chegarmos na finalização do qual mostrará o valor total

# print(' >>> Catalogo <<< ')
# print(' 1 - Air jordan - 500,00')
# print(' 2 - Air max 90 - 350,00')
# print(' 3 - Nike Shox - 600,00')
# print(' 4 - Air Force 1 x Slam Jam - 1424,90')
# print(' 5 - Jordan 34 - 600,00')

# # fazer com dicionario
# catalogo = {
#     'Air jordan' : '500.00',
#     'Air max 90' : 350.00,
#     'Nike Shox' : 600.00,
#     'Air Force 1 x Slam Jam' : 1424.90,
#     'Jordan 34' : 600.00
# }

# carrinho = []

# for carrinho in catalogo:
#     produto = input("Digite um produto >>> ")
#     if produto == catalogo.keys():
#         carrinho.append(catalogo.values)
#         soma = sum(carrinho)
#         print(soma)
#     else:
#         print('teste')

# print(catalogo['air jordan']['valor'])
# print(catalogo['Air max 90'])





# 5)calcule conta, faça uma aplicação js que pegue o número de clientes em uma mesa, o valor total da conta e após isso divida a 
# de forma igual a todos os clientes.


# 6)Sucessor e antecessor, faça uma aplicação que colete um número digitado pelo usuário e logo em seguida mostre em ordem: o numero anterior a ele, o próprio número escolhido e o número sucessor a ele