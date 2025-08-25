// Função para Média de Vetor: Crie uma função que recebe um vetor de double como parâmetro e retorna a média de seus elementos

public class MediaVetor {
    /**
     * Função para calcular a média dos elementos de um vetor de double.
     * @param vetor O vetor de double cujos elementos serão usados para calcular a média.
     * @return A média dos elementos do vetor.
     */
    public static double calcularMedia(double[] vetor) {
        // 1. Verifica se o vetor está vazio para evitar divisão por zero.
        if (vetor.length == 0) {
            return 0; // Retorna 0 se o vetor estiver vazio.
        }

        // 2. Inicializa a soma dos elementos do vetor.
        double soma = 0;

        // 3. Percorre o vetor somando cada elemento.
        for (double num : vetor) {
            soma += num; // Adiciona o valor do elemento atual à soma.
        }

        // 4. Calcula a média dividindo a soma pelo número de elementos no vetor.
        return soma / vetor.length;
    }

    /**
     * Método principal que executa o programa.
     * Pede ao usuário para inserir os elementos do vetor e exibe a média calculada.
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("       CALCULADORA DE MÉDIA");
        System.out.println("=====================================");
        System.out.print("Digite o número de elementos no vetor: ");

        int tamanho = scanner.nextInt();
        double[] vetor = new double[tamanho];

        // Solicita ao usuário que insira os elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        // Chama a função calcularMedia e armazena o resultado
        double media = calcularMedia(vetor);

        // Exibe o resultado para o usuário
        System.out.printf("-> A média dos elementos do vetor é: %.2f%n", media);

        scanner.close();
    }
}
