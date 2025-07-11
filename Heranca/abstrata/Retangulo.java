public class Retangulo extends FormaGeometrica{
    protected double largura;
    protected double altura;

    abstract double area(){
        throw new java.lang.UnsupportedOperationException("Funcao area nao implementada");
    }

    @java.lang.Override
    public String toString() {

        return String.format( "[Retangulo] %#.2f / %.2f", getLargura(), getAltura());
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0){
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else{
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else{
            this.altura = altura;
        }
    }
}
