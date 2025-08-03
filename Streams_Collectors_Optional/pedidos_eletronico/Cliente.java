public class Cliente {
    int codigo;
    String nome;
    boolean premium;


    public Cliente(int codigo, String nome, boolean premium) {
        this.codigo = codigo;
        this.nome = nome;
        this.premium = premium;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPremium() {
        return premium;
    }
}
