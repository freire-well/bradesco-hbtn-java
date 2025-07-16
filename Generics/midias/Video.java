public class Video extends Midia{

    public Video(String nome,int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    private int duracao;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}