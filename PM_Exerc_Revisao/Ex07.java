import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("Digite a data desejada: ");

        String data = ler();

        int[] dataArray = armazenando_data(data);

        System.out.println(verficar_data(dataArray[0], dataArray[1], dataArray[2], data));
    }

    public static String ler() {
        Scanner ler = new Scanner(System.in);
        return ler.nextLine();
    }

    public static int[] armazenando_data(String data) {
        String[] formatoData = data.split("/");
        int[] dataArray = new int[3];
        dataArray[0] = Integer.parseInt(formatoData[0]);
        dataArray[1] = Integer.parseInt(formatoData[1]);
        dataArray[2] = Integer.parseInt(formatoData[2]);

        return dataArray;
    }

    public static String verficar_data(int dia, int mes, int ano, String data){
        String erro = "";
        if(ano < 0){
            erro = "O Ano não esta na formatacao correta ";
        }
        if((dia < 1 || dia > 31) && ((mes > 1 && mes < 12))){
            erro = "O Dia não esta na formatacao correta ";
        }
        else if((mes < 1 || mes > 12) && (dia > 1 && dia < 31)){
            erro = "O Mes não esta na formatacao correta ";
        }
        else if((mes < 1 || mes > 12) && (dia > 1 || dia < 31)){
            erro = "O Dia e o Mes não esta na formatacao correta ";
        }
        else
            erro = "Obrigado por inseir corretamente a data ";
        return erro + data; 
    }
}
