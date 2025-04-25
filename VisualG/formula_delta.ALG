Algoritmo "semnome"

Var
delta, x1, x2, b, a, c : real


Inicio
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
  escreva ("Valor de x1 ", x1)
  escreva ("Valor de x1 ", x2)
  
Fimalgoritmo