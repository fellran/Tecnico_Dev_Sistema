// Crie um programa que separa pares e ímpares: Leia 10 números para um vetor. Depois, crie outros dois vetores, um para os pares e outro para os ímpares.

public class SepararParesImpares {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 9, 4, 6, 3, 8, 11, 14, 5};
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[countPares] = numeros[i];
                countPares++;
            } else {
                impares[countImpares] = numeros[i];
                countImpares++;
            }
        }

        System.out.println("Números pares:");
        for (int i = 0; i < countPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int i = 0; i < countImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
