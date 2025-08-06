public class SistemaFilas {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        Produtor p = new Produtor(fila);
        Produtor p2 = new Produtor(fila);
        Consumidor c = new Consumidor(fila);
        Consumidor c2 = new Consumidor(fila);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c2);





        try {
            int time = 0;
            t1.start();
            t2.start();
            t3.start();
            t4.start();
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
