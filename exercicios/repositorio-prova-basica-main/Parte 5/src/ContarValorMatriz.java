// Contar Valor na Matriz: Peça um número e conte quantas vezes ele aparece em uma matriz.

public class ContarValorMatriz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("\n--- Matriz Informada ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Solicitando o número a ser contado
        System.out.print("Digite um número para contar na matriz: ");
        int numeroParaContar = sc.nextInt();

        // Contando as ocorrências do número na matriz
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == numeroParaContar) {
                    contador++;
                }
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vezes na matriz.");

        sc.close();
    }
}
