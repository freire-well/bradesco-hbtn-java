public class Consumidor extends Thread{
    Fila fila;
    int count;
    boolean consumir = true;

    public Consumidor(Fila fila){
        this.fila = fila;
    }

    public synchronized void consumir(){
        if(fila.getFila().isEmpty()) {
            try {
                wait(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        fila.retirar();
        try {

            Thread.sleep(500);
            notify();
            System.out.println("Consumidor consumiu " + count++);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(consumir){
            consumir();
        }
    }
}
