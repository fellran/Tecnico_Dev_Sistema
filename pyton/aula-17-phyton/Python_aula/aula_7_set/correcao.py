
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
