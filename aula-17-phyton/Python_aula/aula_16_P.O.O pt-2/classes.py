class Motorista:
    def __init__(self,nome):
        self.nome = nome

    def carro(self, marca,modelo,cor,placa):
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.placa = placa

    def acelerar(self, acelerar):
        self.acelerar = acelerar
        if acelerar <= 100:
            # velocidadeAtual += acelerar
            print(f'Velocidade adicionada')
            print(f'Sua Velocidade atual {acelerar}')
        else:
             print('Limite utrapassado')

    def itemPortaMala(self, item):
        self.item = []

      
