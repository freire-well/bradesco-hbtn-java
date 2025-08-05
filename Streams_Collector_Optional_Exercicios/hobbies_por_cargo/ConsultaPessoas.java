import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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
    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo, Collectors.filtering((pessoa -> pessoa.getIdade() > 40), toList())));
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo, () -> new TreeMap<>(
                                Comparator.reverseOrder()),
                                 Collectors.toCollection(() -> new TreeSet<>(
                                         Comparator.comparing(Pessoa::getNome)
                                 )))
                        );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoasList  ){
            return pessoasList.stream().collect(
                    Collectors.groupingBy(
                            Pessoa::getCargo, HashMap::new,
                            Collectors.groupingBy(Pessoa::getIdade, HashMap::new, Collectors.counting()))
                    );
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoasList  ){
            return pessoasList.stream().collect(
                    Collectors.groupingBy(
                            Pessoa::getCargo, HashMap::new,
                            Collectors.averagingDouble(Pessoa::getSalario)
                    ));
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoasList  ){
        return pessoasList.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo, HashMap::new,
                        Collectors.flatMapping(pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new))
                ));
    }
}
