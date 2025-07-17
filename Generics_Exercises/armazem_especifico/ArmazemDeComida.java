import java.util.HashMap;
import java.util.Map;

public class ArmazemDeComida extends Armazem{


    public void adicionarAoInventario(String nome, Comida valor) {
        super.adicionarAoInventario(nome,valor);
    }

    public Comida obterDoInventario(String nome) {
        return (Comida) super.obterDoInventario(nome);
    }

}
