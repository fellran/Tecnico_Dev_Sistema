alunoPt1 = ['Carlos', 'Alessandra', 'Geraldo']
alunoPt2 = ['Guilherme', 'Paloma', 'Natan']

# alnunoPt3 = alunoPt1 + alunoPt2

# print(alnunoPt3)

# unir as duas listas usando o extend()
alunoPt1.extend(alunoPt2)
print(alunoPt1)

# for + array
print(len(alunoPt1))



for nome in alunoPt1:
    print(nome)