import json

def cadastroUsuario():
    nome = input('Digite o nome >>> ') 
    login = input('Digite o login >>>')
    cpf = int(input('Digite o seu CPF (Apenas 11 digitos) >>>'))


    while True:
        senha = input('Digite a senha >>> ')
        c_senha = input('Digite a senha novamente >>> ')

        if senha == c_senha:
            break
        else:
            print('Senha não bate com a confirmação')

    dados = {
        'nome' : nome,
        'login' : login,
        'cpf' : cpf,
        'senha' : senha
    }

    with open('dados.json', 'w', encoding='utf8') as leitura:
        json.dump(
            dados,
            leitura,
            indent=2
        )