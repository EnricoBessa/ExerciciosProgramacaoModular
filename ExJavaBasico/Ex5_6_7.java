import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5_6_7 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\enric\\Documents\\programação\\java\\LPM\\ExJavaBasico\\original.txt";
        String outputFile = "C:\\Users\\enric\\Documents\\programação\\java\\LPM\\ExJavaBasico\\criptografado.txt";

        FileOutputStream outputStream = new FileOutputStream(outputFile);

        criptografar(inputStream, outputStream);

        System.out.println("Arquivo criptografado com sucesso!");

    }

    public static void criptografar(FileInputStream inputStream, FileOutputStream outputStream) throws IOException {
        int byteData = inputStream.read();

        if (byteData != -1) {
            outputStream.write(byteData + 1);
            criptografar(inputStream, outputStream);
        }
    }
}
