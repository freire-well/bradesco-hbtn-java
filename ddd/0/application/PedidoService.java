package application;

import domain.Pedido;
import infrastructure.PedidoRepository;

public class PedidoService {
    PedidoRepository pedidoRepository = new PedidoRepository();

    public void save(Pedido pedido){
        pedidoRepository.salvar(pedido);
    }
}
