"""
Encapsulamento
(sem underline) = public (publico)
(uma underline) = protected (não dever ser usado fora da classe)
(dois underline) = private (não é acessado por outras partes do codigo)
"""

class Carro:
    def __init__(self, nome,cor,placa,peso,marca):
        self.nome = nome
        self.cor = cor
        self.placa = placa
        self.peso = peso
        self.marca = marca
        self.km_atual = 0

    def alteraPlaca(self, placa):
        self.placa = placa
        print(f'Alterei a placa para {self.placa}')

carro1 = Carro('Fiat Uno','branco', 'FIATOP', 20, 'Fiat')
print(carro1)

# vars() mostra todos os valores da classe
print(vars(carro1))

# __dict__ mostra todos os valores da classe
print(carro1.__dict__)

carro1.alteraPlaca('777')

print(carro1.placa)
print(carro1.cor)