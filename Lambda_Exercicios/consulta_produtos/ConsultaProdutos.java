import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtosList, CriterioFiltro c){
        return produtosList.stream().filter(c::testar).toList();
    }
}
