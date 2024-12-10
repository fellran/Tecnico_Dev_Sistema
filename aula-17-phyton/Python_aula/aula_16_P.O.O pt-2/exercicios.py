from classes import Motorista

# Crie um class motorista e um class carro, associe o carro ao motorista e possibilite que ele acelere o carro e também acrescente 
# algo ao porta malas

motorista1 = Motorista('Gilson')
motorista1.carro('Fiat', 'Uno', 'Branco', 'TGF987')
motorista1.acelerar(160)
motorista1.itemPortaMala('3')


motorista2 = Motorista('Jozimar')
motorista2.carro('Fiat', 'Palio', 'Prata', 'RFD987')

print(vars(motorista1))
