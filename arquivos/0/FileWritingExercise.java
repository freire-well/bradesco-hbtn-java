import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;


public class FileWritingExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();
        System.out.print("Digite o conteudo do arquivo linha por linha (para parar, digite \"sair\"): ");
        String linha;
        while(true){
            linha = scanner.nextLine();
            if(linha.equals("sair")){
                break;
            }
        }
        



        scanner.close();
    }
}
