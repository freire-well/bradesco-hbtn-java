
public class Pessoa implements Comparable {
    int codigo;
    String nome;
    String cargo;
    int idade;
    double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario).replace(".", ",");
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Object o) {
        return this.getCargo().compareTo(o.toString());
    }
}
