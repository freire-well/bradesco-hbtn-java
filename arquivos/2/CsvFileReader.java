import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {

        try{
            FileReader fileReader = new FileReader("./funcionarios.csv");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine()) != null){
                String[] func = line.split(",");
                System.out.printf("Funcionário: %s\n", func[0]);
                System.out.printf("Idade: %s\n", func[1]);
                System.out.printf("Departamento: %s\n", func[2]);
                System.out.printf("Salarial: %s\n", func[3]);
                System.out.println("------------------------");
            }
           reader.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
