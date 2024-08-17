import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    String frase = "";
    boolean fim = false;
    while(fim == false){
      System.out.println("Digite uma frase:");
      lerFrase(frase, fim);
      invertida(frase);
    }
  }

  public static String lerFrase(String frase, boolean fim){
    Scanner ler = new Scanner(System.in);
    frase = ler.nextLine();
    if(frase == "fim")
      fim = true;
    ler.close();
    return frase;
  }

  public static String invertida(String frase){
    String frase_invertida = "";
    String[] frase_separada = frase_invertida.split(" ");  
    for(int i = 0; i < frase_separada.length; i++){
      frase_invertida = frase_separada[(frase_separada.length - 1)- i] + " ";
    }
    return frase_invertida;
  }
}