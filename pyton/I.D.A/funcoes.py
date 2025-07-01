candidatos = []

def cadastrar_candidatos():

    print("--- Cadastro de Candidatos ---")
    print("Digite 'z' a qualquer momento para finalizar o cadastro.")

    while True:  
        nome_candidato = input("Digite o nome do candidato: ")

        if nome_candidato.lower() == 'z':
            break  

        candidatos.append(nome_candidato)  
        print(f"'{nome_candidato}' cadastrado(a) com sucesso!")


def votarCanditados():

    print("Votos \n Digite o nome do canditados para votar \n")

    if candidatos:
        print("Candidatos cadastrados:")
        for candidato in candidatos:
            print(f" - {candidato}")
    else:
        print("Nenhum candidato foi cadastrado.")

    return candidatos

    

    

    

