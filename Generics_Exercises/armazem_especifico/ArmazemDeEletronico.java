public class ArmazemDeEletronico extends Armazem{

    public void adicionarAoInventario(String nome, Eletronico valor) {
        super.adicionarAoInventario(nome,valor);
    }

    public Eletronico obterDoInventario(String nome) {
        return (Eletronico) super.obterDoInventario(nome);
    }
}
