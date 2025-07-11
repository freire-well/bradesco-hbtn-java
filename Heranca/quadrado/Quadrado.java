public class Quadrado extends Retangulo {
        private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado < 0){
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0 ");
        }else{
            this.lado = lado;
            super.setLargura(lado);
            super.setAltura(lado);
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("Quadrado %.2f " , lado);
    }
}
