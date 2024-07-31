package set.lista_contatos;

import java.util.HashSet;
import java.util.Set;

public class ListaContatos {
    private Set<Pessoa> pessoaSet;

    public ListaContatos() {
        this.pessoaSet = new HashSet<Pessoa>();
        }

    public void addContato(String nome, int numero){
        pessoaSet.add(new Pessoa(nome, numero));
    }

    public int exibirQtdContatos(){
        return pessoaSet.size();
    }

    public void exibirContatos() {
        System.out.println(pessoaSet);
    }

// TODO:    Duas formas de fazer essas chamadas
    public Set<Pessoa> pesquisaTodosComMsmNome(String nome){
        Set<Pessoa> pesquisaPessoa = new HashSet<>();
        if (!pessoaSet.isEmpty()){
            for (Pessoa p : pessoaSet){
                if (p.getNome().startsWith(nome)) {
                    pesquisaPessoa.add(p);
                }
            }
            System.out.println(pesquisaPessoa);

        } else System.out.println("Lista Vazia");
        return pesquisaPessoa;
    }

// TODO:    Duas formas de fazer essas chamadas
    public void pesquisaNome(String nome){
        Set<Pessoa> pesquisaPessoa = new HashSet<>();
        if (!pessoaSet.isEmpty()){
            for (Pessoa p : pessoaSet){
                if (p.getNome().equalsIgnoreCase(nome)) {
                    pesquisaPessoa.add(p);
                }
            }
            System.out.println(pesquisaPessoa);

        } else System.out.println("Lista Vazia");
    }

    public Pessoa atualizarNumero(String nome, int novoNumero){
        Pessoa cttAtualizado = null; /*Depois que atualizado que ele recebe algum valor*/
        for (Pessoa p : pessoaSet){
            if (p.getNome().equalsIgnoreCase(nome)){
                p.setNumero(novoNumero);
                p = cttAtualizado;
                break;
            }
        }
        return cttAtualizado;
    }
}
