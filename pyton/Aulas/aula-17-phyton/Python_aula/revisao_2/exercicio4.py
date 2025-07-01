# 4)Crie uma classe Aluno que tenha os atributos nome, notas (uma lista) e métodos para calcular a média e verificar se o aluno 
# aprovado (média >= 7). Todo aluno criado deverá ser adicionado a um Json.

import json
import os

class Aluno:
    def __init__(self, nome):
        self.nome = nome
        self._notas = []
    
    def adicionarNota(self, nota):
        self._notas.append(nota)

    def calcularMedia(self):
        if self._notas:
            return sum(self._notas) / len(self._notas)
        else:
            return 0
        
    def verificarMedia(self):
        media = self.calcularMedia()

        if media >= 7:
            print(f'Aluno(a) {self.nome} está aprovado')
        else:
            print('Aluno reprovado')
    
    def exportarAluno():
        dados_alunos = {
            'nome' : self.nome,
            'notas' : self._notas,
            'media' : self.calcularMedia(),
            'aprovacao' : self.verificarMedia()
            }
        if os.path.exists('dados.json'):
            with open('dados.json', 'r', encoding='utf8') as arquivo:
                try:
                    dados = json.load(arquivo)
                except json.JSONDecodeError:
                    dados = []
        else:
            dados = []

        dados.append(dados_alunos)

        with open('dados.json', 'w') as arquivo:
            json.dump(dados, arquivo, indent=2)

        


aluno1 = Aluno('Victor')
aluno1.adicionarNota(9)
aluno1.adicionarNota(9)
print(aluno1._notas)
aluno1.verificarMedia()

aluno2 = Aluno('Bruna')
aluno2.adicionarNota(9)
aluno2.adicionarNota(8)



print(vars(aluno1))
print(aluno1.__dict__)