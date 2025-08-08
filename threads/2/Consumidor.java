public class Consumidor extends Thread{
    Fila fila;



    public Consumidor(Fila fila){
        this.fila = fila;
    }

    public synchronized void consumir(){
        try {
            for (int i = 0; true;) {
                fila.retirar();
                Thread.sleep(500);


            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
            consumir();
    }
}
