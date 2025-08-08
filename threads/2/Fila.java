import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;
    private final int capacidade;

    public Fila( int tamanho) {
        this.fila = new LinkedList<>();
        this.capacidade = tamanho;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public synchronized void adicionar(int i) throws InterruptedException {

            this.fila.add(i);
            notify();
    }

    public synchronized void retirar(){
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
