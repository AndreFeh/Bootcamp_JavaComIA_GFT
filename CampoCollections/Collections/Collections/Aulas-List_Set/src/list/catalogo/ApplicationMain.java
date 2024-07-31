package list.catalogo;

import list.catalogo.model.CatalogoLivros;
import list.catalogo.model.Livro;

public class ApplicationMain {
    public static void main(String[] args) {
        Livro martelo = new Livro("Um Martelinho E Um Sonho", "Andre Feh", 2024);

//        Nao cria o livro, adiciona no catalogo com livros, automaticamente ja cria em Livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro("Livro 1","Autor 1",2020);
        catalogoLivros.addLivro("Livro 2","Autor 2",2018);
        catalogoLivros.addLivro("Livro 3","Autor 3",2017);
        catalogoLivros.addLivro("Livro 1","Autor 4",2010);
        catalogoLivros.addLivro("Livro 4","Autor 4",2023);

//        Pesquisar autor apartir do catalogo
        System.out.println(catalogoLivros.pesquisaAutor("Autor 4"));

//        Pesquisar Entre Anos
        System.out.println(catalogoLivros.pesquisaAno(2020, 2024));

//        Pesquisa por Titulo
        System.out.println(catalogoLivros.pesquisaAutor("Autor 1"));
    }

}
