package set.lista_contatos;

import java.util.Objects;

public class Pessoa {
    String nome;
    int numero;

    public Pessoa(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

//      Faz com que imprima o conteudo e nao a unidade de memoria dele
    @Override
    public String toString() {
        return " | " +
                "Nome = " + nome + ", Numero = " + numero + " | ";
    }

//      Torna o Nome uma Primary Key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome);
    }
//      Torna o Nome uma Primary Key
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
