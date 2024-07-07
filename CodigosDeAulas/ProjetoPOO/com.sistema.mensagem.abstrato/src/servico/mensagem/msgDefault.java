package servico.mensagem;

public class msgDefault {
    public void enviarMensagem(){
//        confirmar conexao
        validarConexao();
        System.out.println("Enviando Mensagem...");
//        salvar historico
        salvarHistorico();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem...");
    }

    /**Metodos Privados! Usuario nao precisa ter ciencia! Funciona so na classe*/
    private void validarConexao(){
        System.out.println("Validando Se Conectado Com Internet...");
    }
    private void salvarHistorico(){
        System.out.println("Salvando Historico De Mensagem...");
    }
}