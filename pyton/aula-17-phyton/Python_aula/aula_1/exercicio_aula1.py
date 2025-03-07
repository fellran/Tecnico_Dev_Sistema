# 1 - Escreva um algoritimo que leia o nome, email e senha de um usuario e mostre apos o cadastro os dados salvos
nome_str = str(input('Digite seu nome \n'))
email_str = str(input('Digite seu email \n'))
senha_str = str(input('Digite sua senha \n'))

# mostrando os dados na tela
print('seu nome é: ', nome_str)
print('sua email é: ', email_str)
print('sua senha é: ', end='***************')

# 2 - Faça um algoritimo para calcular a idade da pessoa baseado no ano do seu nascimento
idade = int(input('Digite sua idade: \n'))
calculo = 2024 - idade

print('Voçê nasceu no ano de ', calculo)