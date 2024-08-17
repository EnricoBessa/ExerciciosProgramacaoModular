import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int tamanho_vetor;

    System.out.println("Digite o tamnho do vetor: ");

    tamanho_vetor = Integer.parseInt(teclado.nextLine());

    System.out.println("O tamanho do vetor é " + tamanho_vetor);

    int[] vetor = new int[tamanho_vetor];

    System.out.println("Digite o valor que desja adicionar ao vetor ");

    for (int i = 0; i < tamanho_vetor; i++) {
      vetor[i] = Integer.parseInt(teclado.nextLine());
    }

    System.out.print("Os valores do seu vetor são: ");

    for (int i = 0; i < tamanho_vetor; i++) {
      System.out.print(vetor[(tamanho_vetor - 1) - i] + "; ");
    }
  }
}