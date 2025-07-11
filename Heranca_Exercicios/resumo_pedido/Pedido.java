public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade() ;
        }       
        return total -  total *(percentualDesconto / 100);
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public void apresentarResumoPedido(){
        double desconto = 0;
        double totalProdutos = 0;
        double totalPedido = 0;

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            totalProdutos += item.getProduto().obterPrecoLiquido();
            System.out.printf("Tipo: %s Titulo: %s Preco: %.2f Quant: %d Total: %.2f\n",
                    item.getProduto().getClass()    .getSimpleName(), item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(), item.getQuantidade(),
                    calcularTotal());
        }
        totalPedido = totalProdutos * totalProdutos * (percentualDesconto / 100 );
        desconto = totalProdutos * (percentualDesconto / 100 );
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPedido);
        System.out.println("----------------------------");

    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
