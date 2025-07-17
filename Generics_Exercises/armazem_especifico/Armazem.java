import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T>{
    private Map<String, T> map = new HashMap<>();


    @Override
    public void adicionarAoInventario(String nome, T valor) {
        map.put(nome,valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return map.get(nome);
    }
}