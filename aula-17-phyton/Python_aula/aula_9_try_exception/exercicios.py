# 1)Peça ao usuário dois números e uma operação matemática (+, -, *, /). Execute a operação e trate erros como divisão por zero e 
# operação inválida.

# def calcular():
#     number1 = int(input('Digite um numero >>> '))
#     operador = str(input('Digite um operador >>> '))
#     number2 = int(input('Digite um numero >>> '))
#     expressoes = ['+', '-', '*', '/']

#     for i in expressoes:
#         if i == operador:
#             operacao = operador
        
#     try:
#         match operacao:
#             case '+':
#                 resul = number1 + number2
#                 print(f'{number1} + {number2} = {resul}')
#             case '-':
#                 resul = number1 - number2
#                 print(f'{number1} - {number2} = {resul}')
#             case '*':
#                 resul = number1 * number2
#                 print(f'{number1} * {number2} = {resul}')
#             case '/':
#                 resul = number1 / number2
#                 print(f'{number1} / {number2} = {resul}')
#     except UnboundLocalError:
#         print('Operação inválida')
#     except ZeroDivisionError:
#         print('Operação não pode dividir por zero')

# calcular()

# 2)Crie um dicionário com informações sobre um aluno (por exemplo, nome, idade, notas). Em seguida, solicite ao usuário uma chave
# para acessar no dicionário. Caso a chave não exista, trate o erro e informe quais chaves estão disponíveis.

dicio_aluno = {
    'nome' : 'Fulano',
    'idade' : '18',
    'nota' : '5.0'
}

name = input('Digite a chave >>> ')

for i in dicio_aluno:
    if i == name:
        nameVerifica = name
    
if name in dicio_aluno:
        print(f'Valor >>> {dicio_aluno[name]}')

try:
    nameVerifica not in dicio_aluno

except NameError:
    print('Chave Dicionario invalida')
    print(f'Chaves disponiveis >>> {list(dicio_aluno)}')
        
# 3)Solicite ao usuário que insira seu peso e altura. Calcule o IMC, mas trate possíveis erros, como entradas inválidas ou divisões
# por zero. Garanta que o programa sempre informe o status do processo no finall

# 4)Crie um programa que simule um caixa eletrônico. Peça ao usuário um valor a ser sacado e deduza de um saldo inicial.
# Caso o usuário tente sacar mais do que o saldo ou insira um valor inválido, trate o erro de forma apropriada. Garanta que o 
# saldo atualizado seja sempre exibido no finally.