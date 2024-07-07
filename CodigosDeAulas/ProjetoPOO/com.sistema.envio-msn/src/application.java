import servico.mensagem.msgFacebookMessenger;
import servico.mensagem.msgMensagensMSN;
import servico.mensagem.msgTelegram;

public class application {
    public static void main(String[] args) {
        System.out.println("Sistema Mensagem");

        msgTelegram telegram = new msgTelegram();
        telegram.nome();
        telegram.enviarMensagem();
        telegram.receberMensagem();

        msgMensagensMSN mensagemSms = new msgMensagensMSN();
        mensagemSms.nome();
        mensagemSms.enviarMensagem();
        mensagemSms.receberMensagem();

        msgFacebookMessenger messenger = new msgFacebookMessenger();
        messenger.nome();
        messenger.enviarMensagem();
        messenger.receberMensagem();
    }
}
