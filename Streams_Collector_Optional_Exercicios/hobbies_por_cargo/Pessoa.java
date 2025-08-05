import java.util.List;

public class Pessoa  {
    int codigo;
    String nome;
    String cargo;
    int idade;
    double salario;
    List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }


    @Override
    public String toString() {
        return String.format("[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario).replace(".", ",");
    }

    public List<String> getHobbies() {
        return hobbies;
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

}
