// Soma Total da Matriz: Calcule e exiba a soma de todos os elementos de uma matriz.

public class SomaTotalMatriz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal = 0;

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j]; // Acumulando a soma dos elementos
            }
        }

        // Imprimindo a matriz
        System.out.println("\n--- Matriz Informada ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a soma total dos elementos
        System.out.println("\nA soma total dos elementos da matriz é: " + somaTotal);

        sc.close();
    }
}
