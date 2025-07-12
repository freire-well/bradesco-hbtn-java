
public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for (int i = 0; i < workflow.getAtividades().size(); i++) {
            workflow.getAtividades().get(i).executar();
        }
    }

}
