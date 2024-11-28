lista_telifonica = {
    'Juca' : '5879',
    'fulano' : '9878',
    'ciclano' : '2545',
    'Marciano' : '3568',
    'Dadin' : '7854'
}

print(lista_telifonica )

# deletando usando o 'del'
# del lista_telifonica['ciclano']
# print(lista_telifonica)

# mostrando somente as chaves do dicionario
# print(list(lista_telifonica))

# ordenando o dicionario
# print(sorted(lista_telifonica))

# verificando a existencia da chave no dicionario
# print('fulano' in lista_telifonica)

# verifica se não existe no dicionario
# print('fulanosd' not in lista_telifonica)

"""
expressoes dentro de um dicionario
para os numeros (2, 4, 6, 9) eleve-os cas uma a 2
printa as chaves e o resultado da equação é o valor da chave
"""
j = {x: x**2 for x in (2, 4, 6, 9)}
print(j)

print(list(j))