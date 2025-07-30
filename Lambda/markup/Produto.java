import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    String nome;
    double preco;
    double percentualMarkup = 10;
    Supplier<Double> precoComMarkup = () -> preco + preco * (percentualMarkup/100);
    Consumer<Double> atualizarMarkup = (d -> percentualMarkup = d);


    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }


}
