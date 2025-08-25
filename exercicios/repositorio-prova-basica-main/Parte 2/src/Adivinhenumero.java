// Adivinhe o Número: Gere um número aleatório entre 1 e 100 e peça ao usuário para adivinhá-lo, dando dicas de "maior" ou "menor" a cada tentativa.

public class Adivinhenumero {
    public static void main(String[] args) {

        int numeroSorteado = (int) (Math.random() * 100) + 1;
        int tentativa;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Tente adivinhar o número entre 1 e 100:");
        do {
            tentativa = sc.nextInt();
            if (tentativa < numeroSorteado) {
                System.out.println("O númeroi é maior!");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor!");
            }
        } while (tentativa != numeroSorteado);
        System.out.println("Parabéns! O número sorteado é " + numeroSorteado);
        sc.close();
    }
}
