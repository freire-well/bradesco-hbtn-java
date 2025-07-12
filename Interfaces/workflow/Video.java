public class Video {
    String arquivo;
    FormatoVideo formato;

    public Video(String arquivo, FormatoVideo formatoVideo) {
        this.arquivo = arquivo;
        this.formato = formatoVideo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public FormatoVideo getFormato() {
        return formato;
    }

    public void setFormato(FormatoVideo formato) {
        this.formato = formato;
    }
}
