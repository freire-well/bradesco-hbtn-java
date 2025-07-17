public class PedidoCookie {
    String sabor;
    int quantidade;

    public PedidoCookie(String sabor, int quantidade) {
        this.sabor = sabor;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}