// Vogal ou Consoante: Peça uma letra e verifique se é uma vogal ou consoante.

public class Vogalconsoante {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        sc.close();

        // Estrutura condicional para verificar se é vogal ou consoante
        if ((letra >= 'a' && letra <= 'z')) {
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letra + " é uma vogal.");
                    break;
                default:
                    System.out.println(letra + " é uma consoante.");
                    break;
            }
        } else {
            System.out.println("Entrada inválida! Por favor, digite uma letra do alfabeto.");
        }
    }
}
