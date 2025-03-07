letras = set()

while True:
    letra = input('Digite uma letra >>> ')
    letras.add(letra.lower())

    if 'p' in letras:
        print('Parabens voçe achou uma das letras')
        break

print('Tente novamente')
print(f'Palavras tentadas: {letras}')

