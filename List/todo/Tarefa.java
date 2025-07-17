public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public void modificarDescricao(String descricaoNova) throws Exception {
        if(descricaoNova.isBlank()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricaoNova;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Tarefa(String descricao, int identificador) {
        if(descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
        this.identificador = identificador;
    }
}