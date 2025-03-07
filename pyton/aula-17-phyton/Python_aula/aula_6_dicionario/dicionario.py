# Dicionario
# Chave e Valor

usuario = {
    # chave    Valor
    'nome' : 'Felipe',
    'email' : 'emailtop@gmail.com',
    'senha' : '123',
    'cpf' : 999999,
    'endereco' : [
        {
            'rua' : '13',
            'cidade' : 'ceilandia',
            'estado' : 'df'
        }
    ]
}


# buscando dados atraves de uma chave
print(usuario['nome'])
print(usuario, type(usuario))


# buscando atravez de um input
pesquisa = input('Digite o que achar >>> ')
print(usuario[pesquisa])

# metodos para dicionario
# len - Quantas chaves existem no dicionario
# keys - Retorna chaves
# values - Retorna valores
# items - Retorna chaves e valores
# setdefault - Adiciona valor se a chave não existe
# get - busca chave
# pop - apaga uma especifica (del)
# popitems - apaga a ultima chave
# update - atualiza dicionarios

print(len(usuario))
print(list(usuario.keys()))
print(list(usuario.values()))
print(list(usuario.items()))

usuario.setdefault('saldo', 0) 

print(usuario.get('nome'))

usuario.pop('nome')
print(usuario)

usuario.popitem()
print(usuario)

# metodos muitos usado por programadores
usuario.update({
    'nome' : 'Victor',
    'email' : 'victor@gmail.com'
})

print(usuario)