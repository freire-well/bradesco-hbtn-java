import java.util.Random;

public class Produtor extends Thread{
    Fila fila;
    int numeroAAcrescentar;
    Random random;
    boolean produzir = true;
    public Produtor(Fila fila){
        this.fila = fila;
        random = new Random();
    }

    private synchronized void produzir() {
        numeroAAcrescentar = random.nextInt(100);

        try {
            if(fila.getFila().size() == fila.getCapacidade()){
            wait(500);
        }
            fila.adicionar(numeroAAcrescentar);
            notify();
            Thread.sleep(1000);
            System.out.println("Produtor produziu " + numeroAAcrescentar);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void run() {
        while(produzir){
            produzir();
        }
    }


}
