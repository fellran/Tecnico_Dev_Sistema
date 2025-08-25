// Verificar Matriz Identidade: Verifique se uma matriz quadrada é uma matriz identidade.

public class MatrizIdentidade {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean isIdentidade = true;

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
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

        // Verificando se é matriz identidade
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    isIdentidade = false;
                    break;
                }
            }
            if (!isIdentidade) {
                break;
            }
        }

        if (isIdentidade) {
            System.out.println("\nA matriz é uma Matriz Identidade.");
        } else {
            System.out.println("\nA matriz NÃO é uma Matriz Identidade.");
        }

        sc.close();
    }
}
