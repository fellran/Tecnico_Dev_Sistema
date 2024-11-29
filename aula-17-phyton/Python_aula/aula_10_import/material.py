# Modulos padrâo do python
# Dicas uteis
# 1- Evite usar nomes de variaveis iguais a importação

# Metodo 1 - puxa todo o metodo
import sys as sistema 

# Metodo 2 - puxa só uma função
from sys import exit as sair

# Modulo 3 - Puxa um arquivo
import um_modulo_balacubaco
from um_modulo_balacubaco import nome


print(sistema.platform)
print(sair)
print(um_modulo_balacubaco.msg())
print(nome)