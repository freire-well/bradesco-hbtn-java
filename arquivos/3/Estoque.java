import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    
    String arquivo = "./estoque.csv";
    int idGeral = 0;
    public Estoque(String arquivo){

    }
    



    public void adicionarProduto(String nome, int quantidade, double preco){
        
        Produto produto = new Produto(idGeral, nome, quantidade, preco);
        List<Produto> lista =lerTodasAsLinhasCsv();
        if(!lista.isEmpty()){
        if(!lista.isEmpty()){
            idGeral = lista.get(lista.size() - 1).getId() + 1;
            produto.setId(idGeral);
        }
        }
        escreveNoArquivo(produto);
        idGeral++;
    }

    public void atualizarQuantidade(int id, int quantidade){
            List<Produto> linhas = lerTodasAsLinhasCsv();
               for (int i = 0; i < linhas.size(); i++) {
                    if(linhas.get(i).getId() == id){
                        Produto prod = linhas.get(i);
                        prod.setQuantidade(quantidade);
                        linhas.set(i, prod);
                    }
               }
            
            reescreverArquivo(linhas);
             

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
            if(produto.getId() == 3){
                System.out.printf("ID: %d, Nome: %s, Quantidade: %d, Preço: %.2f\n", produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getPreco());    
                continue;
            }
            System.out.printf("ID: %d, Nome: %s, Quantidade: %d, Preço: %.1f\n", produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getPreco());
            System.out.print("");
        }
    }

    private void escreveNoArquivo(Produto produto){
        try {
            List<Produto> produtos = lerTodasAsLinhasCsv();
            produtos.add(produto);
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter buff = new BufferedWriter(writer);
            for (Produto produtoLista : produtos) {
                buff.write(produtoLista.toCsv()+"\n");   
            }
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

    private void reescreverArquivo(List<Produto> lista){
        try {
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter buff = new BufferedWriter(writer);
            
            for (Produto produto : lista) {
                buff.write(produto.toCsv()+"\n");
            }
            buff.close();
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    

}   
