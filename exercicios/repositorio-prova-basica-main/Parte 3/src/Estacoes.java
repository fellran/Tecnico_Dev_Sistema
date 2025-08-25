// Estações do Ano: Peça o número de um mês (1-12) e diga a qual estação do ano ele pertence (considerando o hemisfério sul).

public class Estacoes {
    public static void main(String[] args) {
        int mes;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Digite o número do mês (1-12): ");
        mes = sc.nextInt();
        sc.close();

        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("Verão");
                break;
            case 3: case 4: case 5:
                System.out.println("Outono");
                break;
            case 6: case 7: case 8:
                System.out.println("Inverno");
                break;
            case 9: case 10: case 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 12.");
                break;
        }
    }
}
