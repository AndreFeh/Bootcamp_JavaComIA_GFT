package servico.mensagem;

public class msgMensagensMSN extends msgAbstract {
    public void nome(){
        System.out.println("\n\tMENSAGENS SMS/MSN");
    }
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN");
    }

}
