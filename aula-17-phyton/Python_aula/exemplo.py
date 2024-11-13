NOME_USUARIO = 'Felipe'
SENHA_USUARIO = '1234'

nome = input('Digite o seu nome \n')
senha = input('Digite a sua senha \n')

if NOME_USUARIO == nome and SENHA_USUARIO == senha:
    print('Você entrou na plataforma')
else:
    print('Usuario e senha incorreta')