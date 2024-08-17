import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExCalculadora {
    public static void main(String[] args) throws Exception {
        String arquivo = "teste.txt";
        String operacoes[];

        operacoes = ler(arquivo);

        for(String operacao : operacoes)
            System.out.printf("Saida: %s = %f \n" + operacao, resolverOperacao(operacao)); 
    }

    public static String[] ler (String arquivo) throws FileNotFoundException{
        Scanner lendo = new Scanner(new File(arquivo)); 

        String operacoes[];

        int qtd_operacao = Integer.parseInt(lendo.nextLine());
        
        operacoes = new String[qtd_operacao];

        for(int i = 0; i < qtd_operacao; i++){
            operacoes[i] = lendo.nextLine();
        }

        lendo.close();    

        return operacoes;
    }

    public static double resolverOperacao(String operacao){
        String[] detalhe = operacao.split(" ");
        double primeiraParcela = Double.parseDouble(detalhe[0]);
        String sinal = (detalhe[1]);
        double segundaParcela = Double.parseDouble(detalhe[2]);

        return calcValor(primeiraParcela, sinal, segundaParcela);
    }

    public static double calcValor(double primeiraParcela, String sinal, double segundaParcela){
        double resultado = 0;

        switch (sinal) {
            case "+":
                resultado = primeiraParcela + segundaParcela;
                break;
            case "-":
                resultado = primeiraParcela + segundaParcela;
                break;
            case "*":
                resultado = primeiraParcela + segundaParcela;
                break;
            case "/":
                resultado = primeiraParcela + segundaParcela;
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }
}
