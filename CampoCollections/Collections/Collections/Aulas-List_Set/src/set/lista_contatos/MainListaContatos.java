package set.lista_contatos;

public class MainListaContatos {
    public static void main(String[] args) {
        ListaContatos contato = new ListaContatos(); /*LISTA SET EMBARALHA ELEMENTOS*/

        contato.addContato("André", 999885642); // Como SET nao aceita duplicados, o PRIMEIRO a ser adicionado ira Permanecer
        contato.addContato("Felipe", 999885642);
//        contato.addContato("André", 216162325);
        contato.addContato("Lucas", 151568865);
        contato.addContato("Christian", 155499784);
        contato.addContato("Louise", 325166599);
        contato.addContato("André Felipe", 454598965);
        contato.addContato("André Castro", 168953256);
        contato.addContato("André Santos", 161655949);

        System.out.println("Quantidade de Contatos: "+contato.exibirQtdContatos());
        contato.exibirContatos();
        contato.pesquisaTodosComMsmNome("André");
        contato.pesquisaNome("André");
        contato.atualizarNumero("André Santos", 996259930);
        contato.pesquisaNome("André Santos");
        contato.atualizarNumero("André Castro", 996259930);


    }
}
