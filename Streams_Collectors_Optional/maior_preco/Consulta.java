import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido p){
        return  p.getProdutos().stream().filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    public static List<Produto>  obterProdutosPorPrecoMinimo(List<Produto> produtoList, double precoMinimo){
        return  produtoList.stream().filter(produto -> produto.getPreco() > precoMinimo).collect(Collectors.toList());
    }

    public static Produto  obterProdutoMaiorPreco(List<Produto> produtoList){
        Optional<Produto> opt = produtoList.stream().max(Comparator.comparing(Produto::getPreco));

        return opt.get();
    }
}
