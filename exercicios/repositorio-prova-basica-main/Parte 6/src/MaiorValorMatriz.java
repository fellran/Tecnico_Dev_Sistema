// Função para Maior Valor: Crie uma função que recebe uma matriz de inteiros e retorna o maior valor contido nela.

/**
 * Um programa que encontra o maior valor em uma matriz de inteiros usando uma função dedicada.
 */
public class MaiorValorMatriz {

    /**
     * Função que recebe uma matriz de inteiros e retorna o maior valor contido nela.
     * @param matriz A matriz bidimensional de inteiros a ser pesquisada.
     * @return O maior número inteiro encontrado na matriz.
     * @throws IllegalArgumentException se a matriz for nula ou vazia.
     */
    public static int encontrarMaiorValor(int[][] matriz) {
        // 1. Validação para garantir que a matriz não é nula ou vazia.
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("A matriz não pode ser nula ou vazia.");
        }

        // 2. Inicializa a variável 'maior' com o primeiro elemento da matriz.
        int maiorValor = matriz[0][0];

        // 3. Percorre cada linha da matriz (usando for-each para simplicidade).
        for (int[] linha : matriz) {
            // 4. Percorre cada elemento (coluna) da linha atual.
            for (int elemento : linha) {
                // 5. Compara o elemento atual com o maior valor encontrado até agora.
                if (elemento > maiorValor) {
                    // Se o elemento for maior, ele se torna o novo maior valor.
                    maiorValor = elemento;
                }
            }
        }

        // 6. Retorna o maior valor encontrado após percorrer toda a matriz.
        return maiorValor;
    }

    /**
     * Método principal para demonstrar o uso da função encontrarMaiorValor.
     */
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("  ENCONTRANDO O MAIOR VALOR EM UMA MATRIZ");
        System.out.println("==============================================");

        // Matriz de exemplo para teste.
        int[][] minhaMatriz = {
            { 3,  15,  8,  22 },
            { 1,  99, 45,  12 },
            { 7,  -5, 33,  50 }
        };

        // Imprime a matriz para visualização do usuário.
        System.out.println("\nMatriz utilizada no teste:");
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                System.out.print(minhaMatriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Chama a função para encontrar o maior valor na matriz.
        int maior = encontrarMaiorValor(minhaMatriz);

        // Exibe o resultado.
        System.out.println("\n-> O maior valor encontrado na matriz é: " + maior);
    }
}