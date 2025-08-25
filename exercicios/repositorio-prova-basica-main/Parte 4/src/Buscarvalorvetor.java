//  Buscar Valor: Peça um número e verifique se ele existe em um vetor pré-definido. Se existir, mostre a posição.

public class Buscarvalorvetor {
    public static void main(String[] args) {
        int[] vetor = {15, 22, 30, 41, 55, 63, 78, 89, 90, 100};
        System.out.print("Digite um número para buscar no vetor: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int valorBuscado = sc.nextInt();
        sc.close();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBuscado) {
                System.out.println("Valor " + valorBuscado + " encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor " + valorBuscado + " não encontrado no vetor.");
        }
    }    
}
