public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor p = new Produtor(buffer);
        Consumidor c = new Consumidor(buffer);
        Thread threadProdutor = new Thread(p);
        Thread threadConsumidor = new Thread(c);

        threadProdutor.start();
        threadConsumidor.start();
        try {
            threadConsumidor.join();
            threadProdutor.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}