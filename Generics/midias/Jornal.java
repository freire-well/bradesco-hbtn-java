public class Jornal extends Midia{
    private int quantidade;

    public Jornal(String nome,int quantidade) {
        super(nome);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}