package servico.mensagem;

public class msgTelegram extends msgAbstract {
    public void nome(){
        System.out.println("\n\tTELEGRAM");
    }

    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram");
    }
}
