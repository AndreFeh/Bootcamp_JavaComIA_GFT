package set.produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long cod;
    private String nome;
    private int qtd;
    private double preco;

    public Produto(long cod, String nome, int qtd, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "| " +
                "Cod=" + cod +
                ", Nome='" + nome + '\'' +
                ", Qtd=" + qtd +
                ", Preco=" + preco +
                " | ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class ComparatorParaPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco()); /*A Classe Double tem o metodo compare embutido*/
    }
}
