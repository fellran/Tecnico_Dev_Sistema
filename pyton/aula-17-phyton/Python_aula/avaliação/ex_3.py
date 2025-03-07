# 3)Crie um jogo simples em Python:Um número secreto entre 1 e 100 é gerado aleatoriamente.O jogador tem 5 tentativas para adivinhar o número.Após cada tentativa, o programa deve informar:
# "Muito alto!" se o palpite for maior que o número.
# "Muito baixo!" se o palpite for menor que o número.
# "Parabéns, você acertou!" se o palpite for igual ao número.
# Caso o jogador não acerte após 5 tentativas, exiba "Game Over! O número era X".
# Utilize a biblioteca random para gerar o número secreto.
import random

def adivinha():
    numeroSecreto = random.randint(1, 100)

    tentativa = 0

    print('Bem vindo ao jogo de adivinhação!')
    print('Tente adinhar o numero entre 1 e 100')

    while tentativa < 5:
        palpite = int(input('Digite seu palpite'))

        tentativa += 1

        if palpite == numeroSecreto:
            print(f'Parabens, voçe acertou! O numero era {numeroSecreto}')
            break
        elif palpite > numeroSecreto:
            print('Muito Alto!')
        else:
            print('Muito Baixo')
        
        if tentativa == 5:
            print(f'Game Over! O numero era {numeroSecreto}')

adivinha()