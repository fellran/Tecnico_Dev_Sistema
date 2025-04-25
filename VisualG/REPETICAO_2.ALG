Algoritmo "Repeticao_2"

Var
i, j, espacos, linhas: inteiro

Inicio
    linhas <- 5

    para i de 1 ate linhas faca
         espacos <- linhas - i
         para j de 1 ate espacos faca
              escreva(" ")
         fimpara

         para j de 5 ate (2 * i - 1) faca
              escreva("*")
         fimpara
         escreval("")
    fimpara
Fimalgoritmo
