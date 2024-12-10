# 2)Escreva um programa para um sistema de controle de estoque de uma loja. O programa deve:Usar um para armazenar os itens no estoque, onde as chaves são os nomes dos produtos e os valores são as quantidades disponíveis.Permitir que o usuário escolha uma das opções:
# Adicionar um novo produto ao estoque.
# Atualizar a quantidade de um produto existente.
# Verificar se um produto está disponível (quantidade maior que 0).
# Continuar exibindo o menu até que o usuário escolha sair.


def exibir_menu():
    print("\n=== Menu de Controle de Estoque ===")
    print("1 - Adicionar novo produto ao estoque")
    print("2 - Atualizar a quantidade de um produto existente")
    print("3 - Verificar se um produto está disponível")
    print("4 - Sair")
    print("===============================")


def adicionar_produto(estoque):
    nome = input("Digite o nome do produto: ").strip()
    quantidade = int(input(f"Digite a quantidade de {nome}: "))
    if nome in estoque:
        print(f"O produto {nome} já existe. A quantidade será atualizada.")
        estoque[nome] += quantidade
    else:
        estoque[nome] = quantidade
    print(f"{nome} adicionado ao estoque com quantidade {quantidade}.")


def atualizar_quantidade(estoque):
    nome = input("Digite o nome do produto para atualizar: ").strip()
    if nome in estoque:
        quantidade = int(input(f"Digite a nova quantidade de {nome}: "))
        estoque[nome] = quantidade
        print(f"A quantidade de {nome} foi atualizada para {quantidade}.")
    else:
        print(f"O produto {nome} não existe no estoque.")


def verificar_produto(estoque):
    nome = input("Digite o nome do produto para verificar: ").strip()
    if nome in estoque and estoque[nome] > 0:
        print(f"{nome} está disponível no estoque com quantidade {estoque[nome]}.")
    else:
        print(f"{nome} não está disponível no estoque ou a quantidade é 0.")

def controle_estoque():
    estoque = {}  
    while True:
        exibir_menu()
        opcao = input("Escolha uma opção (1-4): ").strip()
        
        if opcao == '1':
            adicionar_produto(estoque)
        elif opcao == '2':
            atualizar_quantidade(estoque)
        elif opcao == '3':
            verificar_produto(estoque)
        elif opcao == '4':
            print("Saindo do sistema de controle de estoque...")
            break
        else:
            print("Opção inválida. Tente novamente.")

controle_estoque()



