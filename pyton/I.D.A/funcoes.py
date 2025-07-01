candidatos = []
votos = {}

def cadastrar_candidatos():
    print("--- Cadastro de Candidatos ---")
    print("Digite 'Z' a qualquer momento para finalizar o cadastro.")

    while True:
        nome_candidato = input("Digite o nome do candidato: ")
        if nome_candidato.lower() == 'z':
            break
        # Armazenar o nome do candidato em minúsculas para facilitar a comparação futura
        candidatos.append(nome_candidato.lower())
        votos[nome_candidato.lower()] = 0  # Inicializa a contagem de votos para o novo candidato em minúsculas
        print(f"'{nome_candidato}' cadastrado(a) com sucesso!")


def votarCandidatos():
    print("\n--- Votos ---")
    print("Digite o nome do candidato para votar. Digite 'Z' para finalizar a votação.")

    if not candidatos:
        print("Nenhum candidato foi cadastrado ainda.")
        return

    print("\nCandidatos cadastrados:")
    # Ao exibir, podemos capitalizar para melhor apresentação, mas os votos são contados com o nome em minúsculas
    for candidato in candidatos:
        print(f"- {candidato.capitalize()}") # Exibe com a primeira letra maiúscula

    while True:
        voto_candidato = input("Digite o nome do candidato em quem deseja votar: ")

        if voto_candidato.lower() == 'z':
            break

        # Converter a entrada do usuário para minúsculas antes de comparar
        voto_candidato_normalizado = voto_candidato.lower()

        if voto_candidato_normalizado in votos:
            votos[voto_candidato_normalizado] += 1
            print(f"Voto para '{voto_candidato_normalizado.capitalize()}' registrado!") # Capitaliza para exibir
            print("Contagem atual de votos:")
            for candidato_nome, contagem in votos.items():
                print(f"- {candidato_nome.capitalize()}: {contagem} votos") # Capitaliza para exibir
        else:
            print("Candidato não encontrado. Por favor, digite o nome de um candidato cadastrado.")

    print("\n--- Resultado Final da Votação ---")
    if not votos:
        print("Nenhum voto foi registrado.")
    else:
        for candidato_nome, contagem in votos.items():
            print(f"- {candidato_nome.capitalize()}: {contagem} votos") # Capitaliza para exibir

def resultado_votos():
    print("\n--- Resultados dos Votos ---")
    if not votos:
        print("Nenhum voto foi registrado.")
    else:
        for candidato_nome, contagem in votos.items():
            print(f"- {candidato_nome.capitalize()}: {contagem} votos") # Capitaliza para exibirSs