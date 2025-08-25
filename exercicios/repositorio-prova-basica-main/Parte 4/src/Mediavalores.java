// Média do Vetor: Calcule a média dos valores armazenados em um vetor.

public class Mediavalores {
    public static void main(String[] args) {
        double[] valores = new double[5];
        double soma = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Digite 5 valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        double media = soma / valores.length;
        System.out.printf("A média dos valores é: %.2f\n", media);
        sc.close();
    } 
}
