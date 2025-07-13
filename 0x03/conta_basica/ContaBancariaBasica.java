import exceptions.*;
public class ContaBancariaBasica {
    String numeracao;
    double saldo;
    double taxaJurosAnual;

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor > 0){
            saldo += valor;
        }else{
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            saldo -= valor;
        }
    }

    public double calcularTarifaMensal(){
        double tarifa = saldo*0.10;
        if(tarifa > 10){
            return 10;
        }else{
            return tarifa;
        }
    }

    public double calcularJurosMensal(){
        if(saldo < 0){
            return 0;
        }else{
            return taxaJurosAnual / 12;
        }
    }

    public void aplicarAtualizacaoMensal(){
        saldo -= calcularTarifaMensal();
        saldo += saldo * (calcularJurosMensal()/100);
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}