import exceptions.*;
public class Livro{
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException{
        if(titulo.length() < 3){
            throw new LivroInvalidoException("Titulo de livro invalido");

        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException{
            String nomeAutor ;
            String sobrenomeAutor ;
            try{
                nomeAutor = autor.split(" ")[0];
                sobrenomeAutor = autor.split(" ")[1];
            } catch (Exception e) {
                throw new AutorInvalidoException("Nome de autor invalido");
            }
            this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException{
        if(preco <= 0){
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }
}