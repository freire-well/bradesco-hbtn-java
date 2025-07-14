import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadingExercise {
    public static void main(String[] args) {
    
        Path path = Paths.get("./exemplo.txt");
        try{
        List<String> lines = Files.readAllLines(path);
        FileReader reader = new FileReader(new File("./exemplo.txt"));
        
        System.out.println("Conteúdo do arquivo 'exemplo.txt':");
        System.out.println("");
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("Leitura do arquivo concluída.");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

