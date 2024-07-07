package servico.mensagem;

public class msgFacebookMessenger extends msgAbstract {

    public void nome(){
        System.out.println("\n\tFACEBOOK MESSENGER");
    }
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Messenger FB");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Messenger FB");
    }

}
