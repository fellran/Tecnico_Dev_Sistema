Algoritmo "contaAté50"

Var
cont, escolher, n1 : inteiro
delta, x1, x2, b, a, c : real


Inicio
      escreval("Escolha as opções")
      escreval(" [1] - Par ou impar")
      escreval(" [2] - bhaskara")
      escreval(" [3] - contador até 50 de 5 em 5")
      leia(escolher)
      
      escolha escolher
      caso 1
            escreva("Digite um numero >>> ")
              leia(n1)

              se (n1 %2 = 0) entao
              escreva("Numero Par >>> ", n1)
              senao
              escreva("Numero Impar >>", n1)
              fimse
              fimalgoritmo
      caso 2
           escreva ("Digite o valor de a : ")
           leia(a)
           escreva ("Digite o valor de b :")
           leia(b)
           escreva ("Digite o valor de c :")
           leia(c)
                  delta <- (b^2) - 4*(a*c)
           escreva("O Valor de delta : ", delta)
              x1 <- (-b + raizq(delta)) / (2*a)
              x2 <- (-b - raizq(delta)) / (2*a)
           escreva ("Valor de x1 ", x1, x2)
           fimalgoritmo
       caso 3
            para cont <- 0 ate 50 passo 5 faca
            escreval(cont)
            fimpara
            fimalgoritmo
fimalgoritmo