// Matriz Transposta: Crie uma matriz e gere a sua transposta (troque linhas por colunas).

public class MatrizTransposta {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        // Gerando a matriz transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        // Imprimindo a matriz original
        System.out.println("\n--- Matriz Original ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        // Imprimindo a matriz transposta
        System.out.println("\n--- Matriz Transposta ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
}
}
