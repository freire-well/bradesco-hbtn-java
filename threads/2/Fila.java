import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;
    private final int tamanho;

    public Fila( int tamanho) {
        this.fila = new LinkedList<>();
        this.tamanho = tamanho;
    }

    public synchronized void adicionar(int i) throws InterruptedException {
        if(fila.size() < tamanho){
            this.fila.add(i);
            notifyAll();
        }else{
            wait();
        }

    }

    public synchronized void retirar(){
        if(!fila.isEmpty()) {
            this.fila.removeFirst();
            notifyAll();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public LinkedList<Integer> getFila() {
        return fila;
    }

    public void setFila(LinkedList<Integer> fila) {
        this.fila = fila;
    }
}
