2# Crie um arquivo onde você possa escolher entre fazer cadastro ou login, faça o cadastro salvar as informações em um json e no 
# login que ele realmente verifique se esse usuario existe.

from login import loginUsuario as l_usuario
from cadastro import cadastroUsuario as c_usuario

while True:
    try:
        print(f'1 - cadastrar \n2 - Login \n')
        opcao = int(input('O que deseja fazer? '))

        match opcao:
            case 1:
                c_usuario()
            case 2:
                l_usuario()
            case _:
                print('Opção invalida')
    except ValueError:
        print('Digite um valor valido!')
    except Exception:
        print('Aconteceu um erro! Tente novamente!')