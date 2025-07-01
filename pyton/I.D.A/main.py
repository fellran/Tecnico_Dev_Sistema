import funcoes


while True:

    print("[1] Cadastrar canditados\n[2] Votar \n[3] Resultados dos votos \n[4] Sair do Programa \n")
    opcao = int(input("Escolha uma opção\n"))

    match opcao:
        case 1:
            # Cadastrar
            funcoes.cadastrar_candidatos()
        case 2:
            # Votar
            funcoes.votarCanditados()
        case 3:
           # Resultados
           print("teste")
        case 4:
           # sair do progra
            break

