# 5)Implemente uma função chamada calculadora que:Receba dois números e uma operação (adição, subtração, multiplicação ou divisão).
# Retorne o resultado da operação.Trate divisões por zero e exiba uma mensagem apropriada.Salve o histórico dela em um json
import json 

def calculadora():
    historico = []

    while True:
        try:
            num1 = float(input('Digite o primeiro numero >>> '))
            num2 = float(input('Digite o segundo numero >>> '))
            operacao = input('Digite operador (+ , - , *, / )\n')

            if operacao == '+':
                result = num1 + num2
            elif operacao == '-':
                result = num1 - num2
            elif operacao == '*':
                result = num1 * num2
            elif operacao == '/':
                if num2 == 0:
                    raise ZeroDivisionError('Divisao por zero!')
                result = num1 / num2
            else:
                print('Operação invalida!')

            historico.append({'num1' : num1,'num2' : num2, 'operacao' : operacao, 'resultado' : result})

            print(f'Resultado >>> {result}')

            
            with open('historico.json', 'w') as f:
                json.dump(historico, f, indent=4)
        except ValueError:
            print('Entrada invalida\nDigite numero validos')
        except ZeroDivisionError:
            print('Não foi possivel fazer divisão por zero')

        continuar = input('Deseja continuar? (s/n)')

        if continuar.lower() != 's':
                break

calculadora()