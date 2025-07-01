# print(10 / 0) ZeroDivisionError

# lista = [0, 1, 2, 3] indexError
# print(lista[4])

# Dicionario = {'chave' : 'valor'} keyError
# print(dicionario['Victor'])

try:
    num_1 = 10
    num_2 = 1

    num_3 = num_1 / num_2

    print(num_3)

    listaBacana = [num_3]
    print(listaBacana[0])

    # raise - chama um erro para acontecer
    raise Exception
          
except ZeroDivisionError as erro:
    print('Nâo pode dividir por 0')
    print(erro)

except IndexError as erro:
    print('Elemento na lista não existe!')
    print(erro)

except KeyError as erro:
    print('Dicionario não existe!')
    print(erro)

except Exception:
    print('Erro desconhecido')

finally:
    print('Execute o programa!')

# try - tenta roda o codigo
# execpt - caso de um erro especifico
# finaly - ultimo codigo a ser executado
