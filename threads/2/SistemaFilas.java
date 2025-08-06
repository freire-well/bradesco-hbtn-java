public class SistemaFilas {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        Produtor p = new Produtor(fila);
        Consumidor c = new Consumidor(fila);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);





        try {
            int time = 0;
            t1.start();
            t2.start();
            while (time < 20){
                Thread.sleep(1000);
                time++;
            }
            c.consumir = false;
            p.produzir = false;

            System.exit(0);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        }


}
