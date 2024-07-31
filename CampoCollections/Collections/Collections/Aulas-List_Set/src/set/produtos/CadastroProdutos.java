package set.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //    atributo
    Set<Produto> produtoSet = new HashSet<>();

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco) {
        produtoSet.add(new Produto(cod, nome, qtd, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtoSet);
    }

    //    Para exibir produtos por nome,
//        TODO: Implemente Comparable em Produto, faça um TreeSet
    public Set<Produto> ordenarPorNome() {
        Set<Produto> ordenacao = new TreeSet<>(produtoSet);/*Nao pode ser HashSet pois embaralharia*/
        return ordenacao;
    }

    public Set<Produto> ordenarPorPreco(){
        Set<Produto> ordenacao = new TreeSet<>(new ComparatorParaPreco());
        ordenacao.addAll(produtoSet);
        return ordenacao;
    }
}

