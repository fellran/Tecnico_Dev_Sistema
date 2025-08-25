// Soma da Diagonal Principal: Calcule a soma dos elementos da diagonal principal de uma matriz 4x4.

import java.util.Scanner;

public class SomaDiagonalMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;

        // Preenchendo a matriz
        System.out.println("--- Preencha a Matriz 4x4 ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Imprime a matriz criada
        System.out.println("\n--- Matriz Informada ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcula a soma da diagonal principal
        for (int i = 0; i < 4; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("\nA soma dos elementos da diagonal principal é: " + somaDiagonal);
        
        entrada.close();
    }
}
