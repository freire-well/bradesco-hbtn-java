import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo));
    }
    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, toList())));
    }
}
