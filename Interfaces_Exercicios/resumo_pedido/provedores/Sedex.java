package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());
        if(peso > 1000){
            frete.setValor(valor * 0.1);
        }else{
            frete.setValor(valor * 0.05);
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.valueOf(this.getClass().getSimpleName().toUpperCase());
    }
}
