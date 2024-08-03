package generics.example;

import java.util.*;

public class GenericExample {

    public static void main(String[] args) {
//        Exemplos sem Generic
//        Permite qualquer tipo de dados
        List listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento 1 Sem Especificacao");
        listaSemGenerics.add(8);

//        Exemplo com Generics
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1 Com Especificacao");
        listaComGenerics.add("Elemento 2 Com Especificacao");
//        listaComGenerics.add(10); ERRO POIS NAO É TIPO STRING

//        ITERANDO SOBRE LISTA COM GENERICS
//          (PASSAR POR CADA ELEMENTO) COM "FOR EACH"
        for (Object elemento : listaComGenerics){
            System.out.println(elemento);
        }

//        ITERANDO SOBRE LISTA SEM GENERICS
//          (PASSAR POR CADA ELEMENTO) COM "FOR EACH"
        //TODO >>> OBJECT é a classe mae de todas as classes dentro do Java
        for (Object elemento : listaSemGenerics){
            String stg = (String) elemento;
            System.out.println(stg);
        }
        /** Esse comando pega transforma lista como String, retornando erro no console por ter numero*/

//        COM SET (HASHSET)
        Set<String> conjuntoSetGenerics = new HashSet<>();
        conjuntoSetGenerics.add("Elemento 1 HashSet");
        conjuntoSetGenerics.add("Elemento 2 HashSet");

        //Iterar com For Each
        for(String elemento : conjuntoSetGenerics){
            System.out.println(elemento);
        }

//        COM MAP (HASHMAP) - FEITO DE FORMA DIFERENTE
        Map mapaSemGenerics = new HashMap();
//        Em vez do ADD, utilizar PUT, passando chave e valor
        mapaSemGenerics.put("chave 1",10);
        mapaSemGenerics.put("Chave 2", "Valor 2");

        Map<String, Integer> mapaComGenerics = new HashMap<>();
        mapaComGenerics.put("Chave 1", 10);
        mapaComGenerics.put("Chave 2", 20);

//        ITERANDO PARA O MAP COM GENERICS
        for (Map.Entry<String, Integer> entry : mapaComGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave " + chave + ", Valor " + valor);
        }

//        ITERANDO PARA O MAP SEM GENERICS
        for(Object obj : mapaSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String)entry.getKey();
            int valor = (Integer)entry.getValue();
            System.out.println("Chave " + chave + ", Valor " + valor);
        }
    }
}