# 1.     Manipulação de lista
# a)  Crie uma lista com os números `[5, 8, 2, 9, 1]`.
number = [5, 8, 2, 9, 1]

# b)  Ordene a lista em ordem crescente e depois em ordem decrescente.
number.sort()
print(number)
number.sort(reverse=True)
print(number)

# c)   Adicione o número `7` ao final da lista e depois insira o número `3` na posição 2.
number.append(7)
print(number)
number.insert(2, 3)
print(number)

# d)   Substitua o valor na posição 1 por `10` e remova o valor `9` da lista.
number[1] = 10
print(number)
number.remove(9)

# e)   Exclua os elementos da posição 2 até a posição 4 (inclusive)
del number[4]
del number[3]
del number[2]

print(number)

# 2).    Maior e Menor

# a)  Crie um programa que solicite ao usuário que insira 4 números.
lista = []

for i in range(0, 4):
    lista.append(input('Digite um numero\n'))

print(lista)
# b)  Identifique e imprima o maior e o menor número da lista inserida.
# monstrando o maior numero da lista
print(max(lista))

# mostrando o menor numero da lista
print(min(lista))