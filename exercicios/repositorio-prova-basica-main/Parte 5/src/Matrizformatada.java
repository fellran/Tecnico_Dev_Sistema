// Preencher e Imprimir Matriz: Crie uma matriz 3x3, peça para o usuário preenchê-la e depois a imprima formatada.

public class Matrizformatada {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz formatada
        System.out.println("\nMatriz 3x3 formatada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}