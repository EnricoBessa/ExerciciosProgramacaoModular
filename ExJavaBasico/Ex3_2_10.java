import java.util.Scanner;

public class Ex3_2_10{
    public static void main(String[] args) throws Exception {
        double salario, hr_extra;

        System.out.println("Digite seu salario ");
        salario = ler();

        System.out.println("Digite as horas extras ");
        hr_extra = ler();

        calcular_hr_extra(salario, hr_extra);

        calcular_inss(salario);

        System.out.println("O valor em R$ de horas extras trabalhadas é de R$" + calcular_hr_extra(salario, hr_extra) + " e o valor descontado para o INSS e de " + calcular_inss(salario));
    }

    public static double ler() throws Exception {
        double valor = 0;
        Scanner scanner = new Scanner(System.in);
        valor = Double.parseDouble(scanner.nextLine());
        //scanner.close();
        return valor;
    }
    /**
     * Recebe o salario e a quantidade de horas extra. Calcula de acordo com essas informações quanto deve rebecer em dinheiro. Retorna um double. 
     * @param salario O salário mensal do funcionário.
     * @param hr_extra A quantidade de horas extras realizadas.
     * @return Double que contém quantas horas extra foram feitas.
     */
    public static double calcular_hr_extra(double salario, double hr_extra){
        double hr_extra_resultado = (( salario / 176) * hr_extra) * salario/2;
        return hr_extra_resultado;
    }
    /**
     * Recebe o salario e calcula de acordo com esse valor o quanto deve pagar de INSS limitando a 150 reais. Retorna um double. 
     * @param salario O salário mensal do funcionário.
     * @return Double que contém o valor a pagar de INSS.
     */
    public static double calcular_inss(double salario){
        double inss_resultado = salario * 0.1;
        if(inss_resultado > 150)
            inss_resultado = 150;

        return inss_resultado;
    }
}
