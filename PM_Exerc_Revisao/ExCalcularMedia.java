import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExCalcularMedia {
  public static void main(String[] args) throws FileNotFoundException{
    String nomeArquivo = "arquivo.txt";
    int[] numeros;
    int quantidadeNumeros;
    
    numeros = lerArquivo(nomeArquivo);
    
    double media = verificarmedia(numeros);

    quantidadeNumeros = acimaMedia(numeros, media);
    
    System.out.println("Tem " + quantidadeNumeros + " acima da media");
  }

  public static int[] lerArquivo(String nomeArquivo) throws FileNotFoundException{
    File arq = new File(nomeArquivo);
    Scanner arquivo = new Scanner(arq);
    int [] valores;
    String detalhes[] = arquivo.nextLine().split(";");

    valores = new int[detalhes.length];

    for (int i = 0; i < detalhes.length; i++)
      valores[i] = Integer.parseInt(detalhes[i]);

    arquivo.close();
    return valores;
  }

  public static int verificarmedia(int[] numeros){
    int soma = 0;
    for(int i = 0; i < numeros.length; i++){
      soma = numeros[i];
    }
    return soma / numeros.length;
  }

  public static int acimaMedia(int[] numeros, double media){
    int acima = 0;
    for(int i = 0; i < numeros.length; i++){
      if(numeros[i] > media)
        acima++;
    }
    return acima;
  }
}