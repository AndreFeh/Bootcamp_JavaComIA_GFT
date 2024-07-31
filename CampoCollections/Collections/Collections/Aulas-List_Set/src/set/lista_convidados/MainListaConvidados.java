package set.lista_convidados;

public class MainListaConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "Dentro do Set Lista Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado1", 2251598);
        conjuntoConvidados.adicionarConvidado("Convidado2", 4845613);
        conjuntoConvidados.adicionarConvidado("Convidado3", 1215896);
        conjuntoConvidados.adicionarConvidado("Convidado4", 2518979);
        conjuntoConvidados.adicionarConvidado("Convidado5", 2251598);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados Dentro do Set Lista Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
