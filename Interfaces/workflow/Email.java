public class Email implements CanalNotificacao {
    @Override
    public void  notificar(Mensagem mensagem) {
        System.out.printf("[%s] {%s} - %s\n", this.getClass().getSimpleName().toUpperCase(), mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
