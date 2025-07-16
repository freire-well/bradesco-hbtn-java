import java.util.*;
public class Biblioteca<T extends Midia>{
    private List<T> lista = new ArrayList<>();

    public void adicionarMidia(T midia){
        lista.add(midia);
    }

    public String obterListaMidias(){
       return lista.toString();
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}