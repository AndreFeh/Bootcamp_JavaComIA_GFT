import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    //    Representa funcao que aceita elemento tipo T e retorna Boolean (Sim ou Nao)
//    Para saber se dentro daquela list tenho pares, sim ou nao
    public static void main(String[] args) {
        List<String> palavra = Arrays.asList("java", "kotlin", "python", "javascript", "c", "golang", "ruby");

//    Esse predicate verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavras -> (palavras.length() > 5);

//        ^- SE EU NAO SEI UTILIZAR PREDICATE
//        palavra.stream().filter(/*predicate*/maisDeCincoCaracteres).forEach(System.out::println);

        /*TODO IMPLEMENTAR COM LAMBDA*/
        palavra.stream().filter(/**ImplementarPredicate*/
                plvrs -> (plvrs.length() > 5))
                /*FOR EACH Consegue imprimir todos os Verdadeiros (maiores que 5)*/
                .forEach(System.out::println);
    }
}
