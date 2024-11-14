# 1 - Crie uma aplicação capaz de identificar a faixa etária com
# base na idade informada pelo usuário. Considere os seguintes critérios:
# Se a idade informada for maior ou igual a 0 e menor que 15, exibir a mensagem “Criança”.
# Se a idade informada for maior ou igual a 15 e menor que 30, exibir a mensagem “Jovem”.
# Se a idade informada for maior ou igual a 30 e menor que 60, exibir a mensagem “Adulto”.
# Se a idade informada for maior ou igual a 60, exibir a mensagem “Idoso”.

nome = str(input('Digite seu nome \n'))
idade = int(input('Digite sua idade \n'))

if (idade >= 0) and (idade < 15):
     print('Criança')
elif (idade >= 15) and (idade < 30):
     print('Jovem')
elif (idade >= 30) and (idade < 60):
     print('Adulto')
else:
     print('Idoso')


# 2) João Papo-de-Pescador, homem de bem, comprou um microcomputadorpara controlar o rendimento diário de seu trabalho.
# Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
# deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um fluxograma que leia a variável P (peso de peixes)
# e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa Que João deverá pagar.
# Caso contrário mostrar tais variáveis com o conteúdo ZERO.

peso_peixe = float(input('Peso do peixe \n'))
exesso = peso_peixe - 50 
valor_multa = exesso * float(4.00)

if (exesso <= 0):
    print('Não pagará multa')
else:
    print('O valor da multa', valor_multa)

