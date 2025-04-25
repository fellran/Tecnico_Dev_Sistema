Algoritmo "Media"

Var
nota1, nota2, media : REAL


Inicio
   escreva("Digite a sua primeira nota >>> ")
   leia(nota1)
   escreva("Digite a sua segunda nota >>> ")
   leia(nota2)
   
   media <- (nota1 + nota2) / 2
   
   se (media > 7) entao
      escreva("Aprovado ", media, ", Nota media: 7")
   senao
        se (media < 7) e (media > 5) entao
         escreva("Recuperacao ", media)
   senao (media <= 4)
                escreva("Reprovado ", media, ", Nota media: 7")
                fimse
                     fimse

Fimalgoritmo