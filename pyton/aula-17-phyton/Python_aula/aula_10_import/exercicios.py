# 1)(timer)Crie um cronômetro reverso com uma mensagem final personalizada usando o módulo time.
# import time
from os import system as sy
import time
sy('cls')
from time import sleep as timer

second = int(input('Quantos segundos tem o timer >>> '))

for i in range(second, 0, -1):
    timer(1)
    print(f'{i} sec')

print('Tempo esgotado')

# 2)(random)Crie um programa que gere uma agenda semanal aleatória com atividades usando o módulo random.
import random

lista_semanal = ['Seg: yoga', 'Ter: Academia', 'Qua: boxe', 'Qui: Literatura', 'Sex: Cinema', 'Sab: Viagem', 'Dom: Trabalho']

sort = random.choice(lista_semanal)
print(sort)

# 3)(calendar)Use o módulo calendar para exibir o calendário completo do ano atual
import  calendar
from datetime import datetime

ano_atual = datetime.now().year
dia_atual = datetime.now().day
mes_atual = datetime.now().month
hora_atual = datetime.now().hour
minute_atual = datetime.now().minute

# print(f'Voce está no ano {ano_atual} \n mês >>> {mes_atual} \n dia atual >>> {dia_atual} \n hora >>> {hora_atual} : {minute_atual} minutos')
# print(calendar.calendar(ano_atual))

# 4)(random)Use o módulo random para sortear um nome de uma lista de participantes.
import random

lista_alunos = ['Paloma', 'Victos', 'Alessandra', 'João', 'Geraldo']

sorteado = random.choice(lista_alunos)

print(sorteado)

