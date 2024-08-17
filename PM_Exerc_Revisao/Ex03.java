import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.print("Digite a altura do retângulo: ");
        String altura = ler();
        System.out.print("Digite a largura do retângulo: ");
        String largura = ler();

        System.out.println(calcPreenchido(largura));
        for (int i = 0; i < Integer.parseInt(altura) - 1; i++)
            System.out.println(calcVazado(largura));
        System.out.println(calcPreenchido(largura));
    }

    public static String ler() {
        Scanner ler = new Scanner(System.in);
        return ler.nextLine();
    }

    public static String calcVazado(String largura) {
        StringBuilder preenchido = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(largura); i++) {
            if (i == 0)
                preenchido.append("x");
            else if (i == Integer.parseInt(largura) - 1)
                preenchido.append("x");
            else
                preenchido.append(" ");
        }
        return preenchido.toString();
    }

    public static String calcPreenchido(String largura) {
        StringBuilder preenchido = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(largura); i++) {
            preenchido.append("x");
        }
        return preenchido.toString();
    }

}
