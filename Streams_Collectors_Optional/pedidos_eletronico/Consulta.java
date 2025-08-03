import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido p){
        return  p.getProdutos().stream().filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    public static List<Produto>  obterProdutosPorPrecoMinimo(List<Produto> produtoList, double precoMinimo){
        return  produtoList.stream().filter(produto -> produto.getPreco() >= precoMinimo).collect(Collectors.toList());
    }

    public static List<Pedido>  obterPedidosComEletronicos (List<Pedido> pedidoList){

        return pedidoList.stream().filter(pedido -> pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO))).toList();
    }


}
