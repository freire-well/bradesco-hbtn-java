public class Principal {
    public static void main(String[] args) {
        Contador count = new Contador();
        ThreadContador threadContador1 = new ThreadContador(count);
        ThreadContador threadContador2 = new ThreadContador(count);

        threadContador1.start();
        threadContador2.start();

        try {
            threadContador2.join();
            threadContador1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Valor final do contador: " + count.getContagem());


    }
}
