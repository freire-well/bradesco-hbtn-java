public class Quadrado {
    public static double area(double lado) throws java.lang.IllegalArgumentException{
        if(lado < 0){
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }else{
            return lado * lado;
        }
    }

}