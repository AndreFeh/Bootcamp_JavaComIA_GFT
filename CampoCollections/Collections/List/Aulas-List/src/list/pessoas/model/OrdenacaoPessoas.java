package list.pessoas.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoas(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

//    Ordenar == Comparable, para ordenacao
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorAltura());
        return pessoaPorAltura;
    }
}
