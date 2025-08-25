// Soma dos Elementos: Calcule e mostre a soma de todos os elementos de um vetor.

public class Somaelementos {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);   
    }
}
