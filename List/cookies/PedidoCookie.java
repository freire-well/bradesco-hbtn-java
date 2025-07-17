public class PedidoCookie {
    String sabor;
    int quantidadeCaixas;

    public PedidoCookie(String sabor, int quantidadeCaixas) {
        this.sabor = sabor;
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public int getQuantidade() {
        return quantidadeCaixas;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeCaixas = quantidade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}