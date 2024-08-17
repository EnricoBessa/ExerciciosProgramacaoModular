import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {

    System.out.print("Digite o primeiro prêmio, 6 digitos: ");
    int primeiroPremio = Integer.parseInt(ler());

    System.out.print("Digite o segundo prêmio, 6 digitos: ");
    int segundoPremio = Integer.parseInt(ler());

    System.out.println("O número vencedor é: " + digitosPremio(primeiroPremio, segundoPremio));
  }

  public static String ler() {
    Scanner ler = new Scanner(System.in);
    return ler.nextLine();
  }

  public static String digitosPremio(int primeiroPremio, int segundoPremio) {
    int num1 = primeiroPremio % 1000;
    int num2 = segundoPremio / 100;

    String digitoDoPremio = num2 + "." + num1;
    return digitoDoPremio;
  }
}
