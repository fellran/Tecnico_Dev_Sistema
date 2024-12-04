# 98 Pop
# nome_motorista = 'Geraldo'
# carro_motorista = 'Renault Kwid'


# class - 'molde do objeto'
# def __init__() - função contrutora
# self - 'o proprio objeto'
# PascalCase - primeira letra maiuscula (Cliente, carro)
# obs : CamelCse - sempre começa com minusculo (clienteVip)


class Motorista:
    def __init__(self, nome, carro, corCarro, placa):
        self.nome = nome
        self.carro = carro
        self.corCarro = corCarro
        self.placa = placa

motorista1 = Motorista('Geraldo', 'Renault Kwid', 'Rosa Pink', '1234-top')
motorista2 = Motorista('Victor', 'Camaro', 'Preto supreme', 'camaro-2')

# motorista1.nome = 'Gerlado'
# motorista1.carro = 'Renault Kwid'

# print(motorista1.nome)
print(motorista1.carro)

print(motorista1, type(motorista1))