import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtosList, Predicate<Produto> c){
        return produtosList.stream().filter(c).toList();
    }
}
