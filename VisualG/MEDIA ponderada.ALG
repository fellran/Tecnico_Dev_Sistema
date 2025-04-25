Algoritmo "media"

Var
   n1, n2, n3, p1, p2, p3, media: real

Inicio
escreva("Digite 1 nota: ")
leia(n1)
escreva("Digite 2 nota: ")
leia(n2)
escreva("Digite 3 nota: ")
leia(n3)
escreva("Digite 1 peso: ")
leia(p1)
escreva("Digite 2 peso: ")
leia(p2)
escreva("Digite 3 peso: ")
leia(p3)

media <- (p1*n1+p2*n2+p3*n3)/(p1+p2+p3)

se media >= 7 entao
   escreva("Aluno aprovado com nota: ", media:2:2)
senao
   escreva("Aluno reprovado com nota: ", media2:2)
fimse

Fimalgoritmo