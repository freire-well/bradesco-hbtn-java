public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    @Override
    public String toString() {
        return String.format("%s %f %f %d %s", nome, preco, peso, quantidadeEmEstoque, getTipo());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }
}
