valorTotal = float(0)

def somarValor():
    global valorTotal
    
    valorProduto = float(input('Preço produto \n'))
    valorTotal += valorProduto

somarValor()

print(f'Valor total é de R$: {valorTotal}')

