import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;


    public void adicionarTarefa(Tarefa tarefa){
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException(String.format("Tarefa com identificador <%s> ja existente na lista", tarefa.getIdentificador()));
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (int i = 0; i < tarefas.size(); i++) {
            if(tarefas.get(i).getIdentificador() == identificador){
                tarefas.get(i).setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (int i = 0; i < tarefas.size(); i++) {
            if(tarefas.get(i).getIdentificador() == identificador){
                tarefas.get(i).setEstahFeita(false);
                return true;
            }
        }
        return false;
    }
    public void desfazerTodas(){
        for (int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahFeita(false);
        }
    }
    public void fazerTodas(){
        for (int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahFeita(true);
        }
    }
    public void listarTarefas(){
        String feita = " ";
        Tarefa tarefa;
        for (int i = 0; i < tarefas.size(); i++) {
            tarefa = tarefas.get(i);
            if(tarefa.isEstahFeita()){
                feita = "X";
            }else{
                feita = " ";
            }
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", feita, tarefa.getIdentificador(), tarefa.getDescricao());
        }
    }



    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }
}