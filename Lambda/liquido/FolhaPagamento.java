public class FolhaPagamento {
    public static double calcularLiquido(Funcionario func, CalculadorDeSalario calc){
        return calc.calcular(func.getSalario());
    }
}
