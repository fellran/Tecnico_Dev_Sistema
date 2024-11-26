"""
Set

não aceita repetições
"""

# Criando set
a = set('Felipe')
teste = ['oi', 'oi', 'oi']
print(a)
print(set(teste))

b = {'Victor', 1, 2, 3, 4, 5, 6}
print(b)

c = set()
print(c, type(c))

# Metodos uteis
conjunto = set()

conjunto.add(10)

conjunto.add(3)

conjunto.update((3, 5, 6, 'Boa pra nois'))

conjunto.discard('Boa pra nois')

print('*' * 20)
print(conjunto)

# Uniâo (union) - une dois
# Intersecção (intersection) - comum nos dois
# Diferença - item presentes apenas em um conjunto

conjuntoA = {1, 2, 3, 4, 5,}
conjuntoB = {5, 6, 7, 8, 9}
conjuntoC = set()

# unindo os dois set
# | union
conjuntoC = conjuntoA | conjuntoB

# & intersection
conjuntoC = conjuntoA & conjuntoB

# - Diference = diferença em relação ao conjunto da esquerda
conjuntoC = conjuntoA - conjuntoB

# ^ diference = diferença em relação a ambos os conjuntos
conjuntoC = conjuntoA ^ conjuntoB

print(conjuntoC)

