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
    int id = 1;

    public Estoque(String arquivo){

    }
    



    public void adicionarProduto(String nome, int quantidade, double preco){
        Produto produto = new Produto(id, nome, quantidade, preco);
           escreveNoArquivo(produto);
           id++;
                  
    }

    public void atualizarQuantidade(int id, int quantidade){

            List<Produto> linhas = lerTodasAsLinhasCsv();
            try {
                Produto produtoASerAlterado = getProdutoFromId(id);
                produtoASerAlterado.setQuantidade(quantidade);
               for (int i = 0; i < linhas.size(); i++) {
                    if(linhas.get(i).getId() == id){
                        linhas.set(i, produtoASerAlterado);
                    }
               }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            
             

    }

    public void excluirProduto(int id){
        List<Produto> lista = lerTodasAsLinhasCsv();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId() == id){
                lista.remove(i);
            }
        }
        reescreverArquivo(lista);
    }

    public void exibirEstoque(){
        List<Produto> listaProduto = lerTodasAsLinhasCsv();
        for (Produto produto : listaProduto) {
            System.out.printf("ID: %d, Nome: %s, Quantidade: %d, Preço: %.1f/n", produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getPreco());
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

    

    private List<Produto> lerTodasAsLinhasCsv(){
        List<Produto> lista = new ArrayList<>();
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buff = new BufferedReader(reader);
            String linha;
            while ((linha = buff.readLine()) != null) {
                String[] produtoString = linha.split(",");
                Produto produto = new Produto(Integer.parseInt(produtoString[0]),produtoString[1],Integer.parseInt(produtoString[2]),Double.valueOf(produtoString[3]) );
                lista.add(produto);
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

    private Produto getProdutoFromId(int id)throws IOException{
        System.out.printf("tentando pegar produto: %d", id);
       List<Produto> lista = lerTodasAsLinhasCsv();
       for (Produto item : lista) {
            if(item.getId() == id){
                return item;
            }
       }
       return null;

    }

    private void reescreverArquivo(List<Produto> lista){
        try {
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter buff = new BufferedWriter(writer);
            Files.delete(Paths.get(arquivo));
            Files.createFile(Paths.get(arquivo));
            for (Produto produto : lista) {
                buff.write(produto.toCsv());
                buff.close();
            }
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    

}   
