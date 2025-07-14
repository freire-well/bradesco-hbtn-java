import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    
    String arquivo = "./estoque.csv";

    public Estoque(String arquivo){

    }
    

    private void criarArquivo(){
       try {
            if(!verificaExistenciaArquivo()){
                Files.createFile(Paths.get(arquivo));
            }
       } catch (IOException e) {
            System.out.println(e.getMessage());

       }
    }

    private boolean verificaExistenciaArquivo(){
        return Files.exists(Paths.get(arquivo));
    }

    public void adicionarProduto(String nome, int quantidade, double preco){
        Produto produto = new Produto(pegaProximoId(), nome, quantidade, preco);
        if(verificaExistenciaArquivo()){
           escreveNoArquivo(produto);
           
        }else{
            criarArquivo();
            escreveNoArquivo(produto);
        }
    }

    public void atualizarQuantidade(int id, int quantidade){
        if(verificaExistenciaArquivo()){
            List<String> linhas = lerTodasAsLinhasCsv();
            for (String item : linhas) {
                if(item.split(",")[0].equals(id)){
                    
                }
            }
        }
    }

    public void excluirProduto(int id){
        if(verificaExistenciaArquivo()){
            try {
                FileReader reader = new FileReader(arquivo);
                BufferedReader buff = new BufferedReader(reader);
                String linha;
                while ((linha = buff.readLine()) != null) {
                    if(linha.split(",")[0].equals(id)){
                       
                    }
                }
                buff.close();
            } catch (FileNotFoundException e) {
               System.out.println(e.getMessage());
            }catch (IOException e) {
                System.out.println(e.getMessage());
             }

        }
    }

    public void exibirEstoque(){
        if(verificaExistenciaArquivo()){
            
        }
    }

    private void escreveNoArquivo(Produto produto){
        try {
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write(produto.toCsv());
            buff.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private int pegaProximoId(){
        int ultimoId = 0;
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buff = new BufferedReader(reader);
            String linha;
            while ((linha = buff.readLine()) != null) {
                ultimoId = Integer.parseInt(linha.split(",")[0]);
            }
            buff.close();
            return ultimoId;
        } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           return 0;
        }catch (IOException e) {
            System.out.println(e.getMessage());
         }
         return 0;
    }

    private List<String> lerTodasAsLinhasCsv(){
        List<String> lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buff = new BufferedReader(reader);
            String linha;
            while ((linha = buff.readLine()) != null) {
                lista.add(linha);
            }
            buff.close();
            return lista;
        } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           return null;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
         }

    }

    private void escreverTodasLinhasArquivo(List<String> lista){
        try {
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter buff = new BufferedWriter(writer);
            for (String linha : lista) {
                buff.write(linha);
                buff.close();
            }
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    

}   
