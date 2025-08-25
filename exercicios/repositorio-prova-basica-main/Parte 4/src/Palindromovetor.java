//  Palíndromo no Vetor: Verifique se um vetor de caracteres (ou inteiros) é um palíndromo (lê-se da mesma forma de trás para frente).

public class Palindromovetor {
    public static void main(String[] args) {
        char[] vetor = {'s', 'u', 'b', 'i', 'n', 'o', 'o', 'n', 'i', 'b', 'u', 's'};
        boolean Palindromo = true;

        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                Palindromo = false;
                break;
            }
        }

        if (Palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }
    }
}
