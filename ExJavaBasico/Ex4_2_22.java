import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_2_22 {
    public static void main(String[] args) {
        ArrayList<String> voto_decidido = new ArrayList<String>();
        int indice = 0;
        
        while (true) {
            System.out.println("Digite seu voto: ");
            String decisao = ler();
            
            if (decisao.equals("5")) 
                break;

            voto_decidido.add(decisao);
            indice++;
        }
        
        calcular_vencedor(voto_decidido);
        calcular_branco(voto_decidido);
        calcular_nulo(voto_decidido);

        System.out.println("O vencedor foi o " + calcular_vencedor(voto_decidido) + " candidato. Houverem " + calcular_branco(voto_decidido) + " votos em branco e " + calcular_nulo(voto_decidido) + " votos nulos");

        System.out.println("ACABOU");
    }

    public static String ler() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Calcula o vencedor baseado na contagem de votos.
     * @param voto_decidido Uma lista de votos, onde cada voto é representado por uma string contendo um número.
     * @return O número do vencedor (1, 2 ou 3) com base na quantidade de votos. Retorna 0 em caso de empate ou sem votos válidos.
     */
    public static int calcular_vencedor(ArrayList<String> voto_decidido) {
        int qntd_votos_1 = 0, qntd_votos_2 = 0, qntd_votos_3 = 0;
        int voto_vencedor = 0;

        for (String voto : voto_decidido) {
            int votoInt = Integer.parseInt(voto);
            switch (votoInt) {
                case 1:
                    qntd_votos_1++;
                    break;
                case 2:
                    qntd_votos_2++;
                    break;
                case 3:
                    qntd_votos_3++;
                    break;
                default:
                    qntd_votos_1 = 0;
                    qntd_votos_2 = 0;
                    qntd_votos_3 = 0;
                    break;
            }
        }

        if (qntd_votos_1 > qntd_votos_2 && qntd_votos_1 > qntd_votos_3) 
            voto_vencedor = 1;
        else if (qntd_votos_2 > qntd_votos_1 && qntd_votos_2 > qntd_votos_3) 
            voto_vencedor = 2;
        else if (qntd_votos_3 > qntd_votos_1 && qntd_votos_3 > qntd_votos_2) 
            voto_vencedor = 3;
        else 
            voto_vencedor = 0; // Em caso de empate ou sem votos válidos

        return voto_vencedor;
    }

    /**
     * Calcula a quantidade de votos em branco.
     * @param voto_decidido Uma lista de votos, onde cada voto é representado por uma string contendo um número.
     * @return O número total de votos em branco, representados pelo número 4.
     */
    public static int calcular_branco(ArrayList<String> voto_decidido) {
        int voto_branco = 0;

        for (String voto : voto_decidido) {
            if (Integer.parseInt(voto) == 4) 
                voto_branco++;
        }

        return voto_branco;
    }

    /**
     * Calcula a quantidade de votos nulos.
     * @param voto_decidido Uma lista de votos, onde cada voto é representado por uma string contendo um número.
     * @return O número total de votos nulos, representados pelo número 0.
     */
    public static int calcular_nulo(ArrayList<String> voto_decidido) {
        int voto_nulo = 0;

        for (String voto : voto_decidido) {
            if (Integer.parseInt(voto) == 0) 
                voto_nulo++;
        }
        
        return voto_nulo;
    }
}
