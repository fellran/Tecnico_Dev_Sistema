def somarMuitos(*numeros):
    valorTotal = 0

    for numero in numeros:
        valorTotal += numero
    print(numeros, valorTotal)

somarMuitos(1, 2)
somarMuitos(5, 87, 21, 62)
