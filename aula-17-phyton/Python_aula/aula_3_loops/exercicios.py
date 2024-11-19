# 1) Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
for i in range(1, 11):
    cal = i * 8
    print(f'{i} x 9 = {cal}')

# 2) Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: “Múltiplo de 10”.
for i in range(1, 101):
     print(i)
     if ( i % 10 == 0):
         print(i,' é multiplo de 10')
    
# 3)ler 3 números Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos

number1 = int(input('Digite um numero \n'))
number2 = int(input('Digite um numero \n'))
number3 = int(input('Digite um numero \n'))

if (number1 > number2 and number1 > number3):
    print(f'O numero {number1} é maior')
elif (number2 > number1 and number2 > number3):
    print(f'O numero {number2} é maior')
else:
     print(f'O numero {number3} é maior')
