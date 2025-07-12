import java.util.ArrayList;
import java.util.List;
import atividades.*;

public class Workflow {

    private List<Atividade> atividades = new ArrayList<>();


    public void registrarAtividade(Atividade atividade){
        atividades.add(atividade);
    }
    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
}
