# 1) Crie uma função que multiplica todos os argumentos não nomeados recebidos e Retorne o total para uma variável
#  e mostre o valor da variável.
n1 = int(input('Digite um numero \n'))
n2 = int(input('Digite outo numero \n'))

def multiplicacao():
    
    resultado = n1 * n2
    return resultado

# print(f'{n1} x {n2} = {multiplicacao()}')

# 2) Crie uma função fala se um número é par ou ímpar. Retorne se o número é par ou ímpar.
number = int(input('Informe um numero \n'))

def par_impar():
    if number % 2 == 0:
         print(f'O {number} é par')
    else:
        print(f'O {number} é impar')
    
# print(par_impar())

# 3) faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
#  Considerar que a média é ponderada e que o peso das notas é 2,3 e 5.
nota1 = float(input('Digite nota 1 >> ')) * 2
nota2 = float(input('Digite nota 2 >> ')) * 3
nota3 = float(input('Digite nota 3 >> ')) * 5

def nota_media(nota1, nota2, nota3):

    media = (nota1 + nota2 + nota3) / (10)

    return media

print(f'a media é {nota_media(nota1, nota2, nota3)}')

