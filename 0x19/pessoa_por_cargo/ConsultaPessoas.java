import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo));
    }
}
