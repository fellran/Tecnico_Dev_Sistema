print('---Catalogo---')
print('A) Pamonha - R$ 7,00')
print('B) Caldo - R$ 4,00')
print('C) Pastel - R$ 4,00')
print('D) Café - R$ 3,00')
print('E) Cancelar')
print('F) Finalizar')

opcao = str(input('Qual opção desejada: '))
valorTotal = float

# avaliar condicao especifica
match opcao:
    case 'a':
        print('Você esolheu pamonha')
        valorTotal = 7.00
    case 'b':
        print('Você escolheu Caldo')
        valorTotal = 4.00
    case 'c':
        print('Você escolheu Pastel')
        valorTotal = 4.00
    case 'd':
        print('Você escolheu Café')
        valorTotal = 4.00
    case 'e':
        print('Pedido cancelado')
    case 'f':
        print('Total pedido', valorTotal)
