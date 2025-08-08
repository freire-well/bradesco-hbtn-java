import java.util.Random;

public class Produtor extends Thread{
    Fila fila;
    int numeroAAcrescentar;
    Random random;

    public Produtor(Fila fila){
        this.fila = fila;
        random = new Random();
    }


    private synchronized void produzir() {

        for (int i = 0; true;) {

            numeroAAcrescentar = random.nextInt(1, 100);

            try {
                fila.adicionar(numeroAAcrescentar);
                System.out.println("Produtor produziu: " + numeroAAcrescentar);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void run() {
            produzir();
    }


}
