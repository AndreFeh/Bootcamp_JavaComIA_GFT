package list.catalogo.model;

public class Livro {
    private String titulo, autor;
    private int anoPub;

    public Livro(String titulo, String autor, int anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

//    TO STRING para retornar os nomes nas listas em vez de unidade de memoria
    @Override
    public String toString() {
        return "|'Livro =" + titulo + '\'' +
                ", Autor ='" + autor + '\'' +
                ", AnoPub =" + anoPub + "|";
    }
}
