public class Consumidor extends Thread{
    Fila fila;



    public Consumidor(Fila fila){
        this.fila = fila;
    }

    public synchronized void consumir(){
        try {
            for (int i = 0; true;) {
                if(fila.getFila().isEmpty()) {
                    System.out.println("Consumidor bateu numa lista vazia");
                    this.wait(500);
                }
                fila.retirar();
                notify();
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
