def converteDolar(valor):
    valor *= 5.82
    return valor

print(converteDolar(5))

# def nome(parametro)
#   processo
# vs
# lambda parametro : processo

# Vantagens do lambda 
# resume processo simples
# ajuda na legibilidade
# evite chamar em def em caso de uma linha

# Desvantagens
# não é eficaz em processos maiores
# em falta de atenção, dificulta variaveis
converterEuro = lambda valor : valor * 6.66
converterIene = lambda valor, taxa : valor / 0.3 - taxa
print(converterEuro(20))
print(converterIene(1000,40))


# Ternario
condicao = True
if condicao:
    print('if')
else:
    print('else')

print('if') if condicao else print('else')

valor = 0
valor = 1 if condicao else valor
print(valor)