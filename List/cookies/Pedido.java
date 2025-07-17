import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookie;


    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookie.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int quantidade = 0;
        Iterator<PedidoCookie> iterator = cookie.iterator();
        while (iterator.hasNext()){
            quantidade += iterator.next().getQuantidade();
        }
        return quantidade;
    }

    public int removerSabor(String sabor){
        int quantidadeRemovidos = 0;
        PedidoCookie p;
        Iterator<PedidoCookie> iterator = cookie.iterator();
        while (iterator.hasNext()){
            p = iterator.next();
            if(p.getSabor().equals(sabor)){
                quantidadeRemovidos += p.getQuantidade();
                iterator.remove();
            }
        }
        return quantidadeRemovidos;
    }

    public Pedido() {
        this.cookie = new ArrayList<>();
    }

    public ArrayList<PedidoCookie> getCookie() {
        return cookie;
    }

    public void setCookie(ArrayList<PedidoCookie> cookie) {
        this.cookie = cookie;
    }
}