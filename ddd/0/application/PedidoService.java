package application;

import domain.Cliente;
import domain.Pedido;
import infrastructure.PedidoRepository;

public class PedidoService {
    PedidoRepository rep = new PedidoRepository();

    public void save(Pedido pedido){
        rep.salvar(pedido);
    }
}
