import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
 import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.util.Scanner;


public class FileWritingExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();
        try {
            System.out.print("Digite o conteudo do arquivo linha por linha (para parar, digite \"sair\"): ");
            String linha;
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            while(true){
                linha = scanner.nextLine();
                if(linha.equals("sair")){
                    break;
                }
                writer.write(linha);          
            }
            writer.close();
        } catch (IOException e) {
         System.out.println(e.getMessage());
        }



        scanner.close();
    }
}
