import exceptions.*;
public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;


    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException{
        super.sacar(valor);
        saldo -= 0.10;
        quantidadeTransacoes++;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException{
        super.depositar(valor);
        saldo -= 0.10;
        quantidadeTransacoes++;

    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }
}