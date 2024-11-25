# 4)Implemente uma lojinha virtual simples! Onde possamos ter um catálogo com 5 produtos e nesse podemos adicionar ao carrinho ou
# visualizar-lo. Até chegarmos na finalização do qual mostrará o valor total

carrinho = []
valorTotal = 0

def carregarCatalogo():
    print('1 - Shampo - R$ 14.00')
    print('2 - Pasta de dentes R$ 20.00')
    print('3 - Sabonete R$ 4.00')
    print('4 - Fio dental R$ 25.00')
    print('5 - Condicionador R$ 10.00')
    print('6 - Mostrar carrinho')
    print('7 - Finalizar')

    global escolha
    escolha = input('Digite a opção desejada >>> ')

def adicionarCarrinho(nome, valor):
    global valorTotal
    carrinho.append(nome)
    valorTotal += valor
    print(f'{nome} adicionado com sucesso!')



while True:
    carregarCatalogo()
    if escolha == '1':
        adicionarCarrinho('shampo', 14.00)
    elif escolha == '2':
        adicionarCarrinho('Pasta de dentes', 20.00)
    elif escolha == '3':
        adicionarCarrinho('Sabonete', 4.00)
    elif escolha == '4':
        adicionarCarrinho('Fio dental', 25.00)
    elif escolha == '5':
        adicionarCarrinho('Condicionador', 10.00)
    elif escolha == '6':
        print(carrinho)
    elif escolha == 7:
        break
    else:
        print('Opção invalida! Tente Novamente')

    print(f'Valor total da compra é {valorTotal}') 


