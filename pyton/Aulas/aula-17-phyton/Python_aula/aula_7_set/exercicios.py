# 1)Encontrar alunos que cursam apenas uma disciplina dado as disciplinas:
# -matematica com os nomes dos alunos que fazem Matemática
# -fisica com os nomes dos alunos que fazem 
# Encontre os alunos que fazem apenas uma das disciplinas.
matematica = {'Felipe', 'joão', 'Lucas'}
fisica = {'xande', 'daniel', 'Lucas'}
materia = set()

materia = matematica - fisica 

print(materia)

# 2)Duas lojas possuem estoques diferentes de produtos. Encontre os produtos disponíveis em ambas e os exclusivos de cada loja.
loja1 = {'nike', 'adidas', 'mizuno'}
loja2 = {'camisa', 'calca', 'jaqueta', 'nike'}
conjunto = set()

conjunto = loja1 & loja2
print(conjunto)
conjunto = loja1 - loja2
print(conjunto)
conjunto = loja2 - loja1
print(conjunto)

# 3) Faça o jogo da forca em python utilizando o Set() como base!

def exercicio3():
    # python - palavra secreta
    # _ _ _ _ _ 6 tentativas
    # Qual letra vai tentar?

    tentativas = 6
    palavra_secreta = 'python'
    letras_p_secreta = set(palavra_secreta)
    letra_tentadas = set()

    while tentativas > 0 and letras_p_secreta:
        # exibir a palavra
        palavra_exibida = []
        for letra in palavra_secreta:
            if letra in letra_tentadas:
                palavra_exibida.append(letra)
            else:
                palavra_exibida.append('_')

        print('Palavra:', ' '.join(palavra_exibida))

        # pedir uma letra
        letra = input('Digite uma letra >>> ').lower()

        # adicionar nas tentativas
        letra_tentadas.add(letra)

        # verificar acerto
        if letra in letras_p_secreta:
            print(f'Boa! a letra {letra} está na palavra')
            letras_p_secreta.remove(letra)
        else:
            print(f'Oh não, a letra {letra} não existe')
            print(f'Vidas restantes : {tentativas}')
        
        if not letras_p_secreta:
            print(f'Voçe ganhou o jogo! palavra secreta {palavra_secreta}')
        else:
            print(f'Game over! a palavra secreta {palavra_secreta}')

        # if letra == '0':
            # break

exercicio3()
