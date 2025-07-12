import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal){
        canais.add(canal);
    }
    public void processar(Video video){
        Mensagem mens = new Mensagem();
        for (int i = 0; i < canais.size(); i++) {
            mens.setTexto(video.getArquivo() + " - " + video.getFormato());
            mens.setTipoMensagem(TipoMensagem.LOG);
            canais.get(i).notificar(mens);
        }
    }
}
