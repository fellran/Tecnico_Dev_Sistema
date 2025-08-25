// Soma de Matrizes: Dadas duas matrizes de mesma dimensão, crie uma terceira matriz que seja a soma das duas primeiras.

public class SomaMatrizes {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizSoma = new int[3][3];

        // Preenchendo a primeira matriz
        System.out.println("Digite os elementos da primeira matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }

        // Preenchendo a segunda matriz
        System.out.println("Digite os elementos da segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Calculando a soma das duas matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Imprimindo a matriz resultante
        System.out.println("\nMatriz Resultante da Soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matrizSoma[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
