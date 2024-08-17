import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tamanho_vetor;

        int soma;

        System.out.println("Digite o tamanho do vetor: ");

        tamanho_vetor = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite os valores que deseja adicionar ao vetor:");

        int[] vetor = new int[tamanho_vetor];

        for(int i = 0; i < tamanho_vetor; i++){
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }

        for(int i = 0; i < tamanho_vetor; i++){
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }

    }
}
