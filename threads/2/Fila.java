import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;
    private final int capacidade;

    public Fila( int capacidade) {
        this.fila = new LinkedList<>();
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public synchronized void adicionar(int i) throws InterruptedException {
            while(this.fila.size() == capacidade){
                wait();
            }
            this.fila.add(i);
            notify();
    }

    public synchronized void retirar() throws InterruptedException{
        while(this.fila.isEmpty()){
            wait();
        }
        System.out.println("Consumidor consumiu: " + fila.getFirst());
        this.fila.removeFirst();
        notify();
    }

    public LinkedList<Integer> getFila() {
        return fila;
    }

    public void setFila(LinkedList<Integer> fila) {
        this.fila = fila;
    }
}
