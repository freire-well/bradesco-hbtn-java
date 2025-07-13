package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(obterTipoProvedorFrete());
        if(peso > 5000){
            frete.setValor(valor * 0.12);
        }else{
            frete.setValor(valor * 0.04);
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.valueOf(this.getClass().getSimpleName().toUpperCase());
    }
}
