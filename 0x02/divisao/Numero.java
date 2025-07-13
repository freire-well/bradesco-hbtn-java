public class Numero{
    public static void dividir(int a, int b){

        int resultado = 0;
        try{
            resultado = a/b;
        } catch (java.lang.Exception e) {
            resultado = 0;
            System.out.println("Nao eh possivel dividir por zero");
        }finally {
            System.out.printf("%d / %d = %d", a, b, resultado);

        }
    }

}

