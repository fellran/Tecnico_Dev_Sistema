# 1) Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
def tabuada(number):
    for i in range(1, 11):
        result = i * number
        print(f'{i} x {number} = {result}')

tabuada(5)

# 2)Faça um algoritmo que avalie se o usuario e senha cadastrados e se não tiver, printe uma falha senao printe que deu tudo certo
# (considerar que usuario e senha sejam ''ADM')
user = input('Digite o login >>> ')
senha = input('Digite sua senha >>> ')

verificar_user_login = user == 'ADM' and senha == 'ADM'

print('Deu tudo certo') if verificar_user_login else print('Não deu certo')