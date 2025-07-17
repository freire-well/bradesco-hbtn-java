import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;


    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int quantidade = 0;
        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()){
            quantidade += iterator.next().getQuantidade();
        }
        return quantidade;
    }

    public int removerSabor(String sabor){
        int quantidadeRemovidos = 0;
        PedidoCookie p;
        Iterator<PedidoCookie> iterator = cookies.iterator();
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
        this.cookies = new ArrayList<>();
    }

    public ArrayList<PedidoCookie> getCookie() {
        return cookies;
    }

    public void setCookie(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }
}