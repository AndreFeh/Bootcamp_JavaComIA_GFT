package list.catalogo.model;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPub){
        livroList.add(new Livro(titulo, autor, anoPub));
    }

//Se nao tiver lista, nao tem como fazer essa verificacao
    public List<Livro> pesquisaAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaAno (int anoInicial, int anoFinal){
        List<Livro>intervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPub() >= anoInicial && l.getAnoPub() <= anoFinal){
                    intervaloAnos.add(l);
                }
            }
        }
        return intervaloAnos;
    }

    public List<Livro> pesquisaLivro (String tutulo){
        List<Livro> pesquisaPorTitulo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(tutulo)){
                    pesquisaPorTitulo.add(l);
                    break;
                }
            }
        }
        return pesquisaPorTitulo;
    }
}
