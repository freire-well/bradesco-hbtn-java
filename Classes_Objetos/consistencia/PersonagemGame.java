public class PersonagemGame{
    private String nome;
    private int saudeAtual;
    private String status;

    public void tomarDano(int quantidadeDeDano){
        setSaudeAtual(getSaudeAtual() - quantidadeDeDano);
        if(getSaudeAtual() <0){
            setSaudeAtual(0);
        }
    }
    public void receberCura(int quantidadeDeCura){
        setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
        if(getSaudeAtual() > 100){
            setSaudeAtual(100);
        }
    }

    public PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.equals("")){
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {

        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {

        this.saudeAtual = saudeAtual;
        if (getSaudeAtual() > 0){
            setStatus("vivo");
        }else{
            setStatus("morto");
        }

    }
}