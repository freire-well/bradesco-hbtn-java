import java.util.List;

public class Pedido {
    int codigo;
    List<Produto> produtos;
    Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", codigo, cliente.getNome());
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

