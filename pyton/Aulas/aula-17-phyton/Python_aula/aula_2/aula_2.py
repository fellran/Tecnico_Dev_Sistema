# operadores logicos

adicao = 10 + 10 # somar
subtracao = 10 - 10 # sibitrair
multiplicacao = 10 * 10 # multiplicação
divisao = 10 / 10 # dividir
divisao_inteira = 10 // 10 # Divisão arredondada
exponenciacao = 10 ** 10 # exponenciação
modulo = 10 % 10 # resto da divisão

# operadores relacionais
# > maior
# < menor
# >= maior ou igual
# <= menor ou igual
# != diferente
# == igualdade ou igual igual

condicao = True

if condicao:
    print('if')
else:
    print('else')

# maior que
n1 = float(input("Digite o primeiro numero: \n"))
n2 = float(input("Digite o segundo numero: \n"))

if n1 > n2:
    print("Primeiro numero é maior", n1)
elif n2 > n1:
    print("O segundo numero é maior", n2)