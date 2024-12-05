# Crie um class motorista e um class carro, associe o carro ao motorista e possibilite que ele acelere o carro e também acrescente 
# algo ao porta malas

class Motorista:
    def __init__(self,nome):
        self.nome = nome

class Carro:
    def __init__(self, marca,modelo,cor,placa):
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.placa = placa
    
    def acelerarCarro(self,acelerar):
        self.acelerar = acelerar

motorista = Motorista('Gilson')
carro = Carro('Fiat', 'Uno', 'Branco', '43RFU')

print(motorista.nome)
print(vars(carro))
