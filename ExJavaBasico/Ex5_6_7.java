import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5_6_7 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\enric\\Documents\\programação\\java\\LPM\\ExJavaBasico\\original.txt";
        String outputFile = "C:\\Users\\enric\\Documents\\programação\\java\\LPM\\ExJavaBasico\\criptografado.txt";

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        
        criptografar(new FileInputStream(inputFile), outputStream);

        System.out.println("Arquivo criptografado com sucesso!");
    }

    /**
     * Criptografa o conteúdo do arquivo de entrada e escreve no arquivo de saída.
     * @param inputStream O fluxo de entrada do arquivo que será criptografado.
     * @param outputStream O fluxo de saída para o arquivo criptografado.
     * @throws IOException Se ocorrer um erro de entrada/saída durante a leitura ou escrita dos arquivos.
     */
    public static void criptografar(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        int byteData = inputStream.read();

        if (byteData != -1) {
            outputStream.write(byteData + 1);
            criptografar(inputStream, outputStream);
        }
    }
}
