import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;
    private final int tamanho;

    public Fila( int tamanho) {
        this.fila = new LinkedList<>();
        this.tamanho = tamanho;
    }

    public synchronized void adicionar(int i) throws InterruptedException {
        if(fila.size() == tamanho){
            wait();
        }else{
            this.fila.add(i);
            notifyAll();
        }

    }

    public synchronized void retirar(){
        if(fila.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            this.fila.removeFirst();
            notifyAll();
        }
    }

    public LinkedList<Integer> getFila() {
        return fila;
    }

    public void setFila(LinkedList<Integer> fila) {
        this.fila = fila;
    }
}
