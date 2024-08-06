import com.sun.tools.javac.Main;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá Seja Bem-Vindo(a)";

//        Gerar saudacao, limite mostra quantas vzs repetir saudacao e toList para transformar isso em List
//        List<String> listaSaudacao = Stream.generate(saudacao).limit(5).collect(Collectors.toList());

//        TODO: COMO NAO SEI IMPLEMENTAR UM SUPPLIER, FAREI DESSA FORMA (1° NORMAL, 2° LAMBDA)
//        List<String> listaSaudacao = Stream.generate(
//                new Supplier<String>() {
//                    @Override
//                    public String get() {
//                        return "Olá Seja Bem-Vindo(a)";
//                    }
//                }).limit(3).toList();

//        TODO: LAMBDA
        List<String> listaSaudacao = Stream.generate(
                        () -> "Olá Seja Bem-Vindo(a)")
                .limit(3).toList();
//                Como Supplier nao permite nenhum retorno, necessario fazer um () vazio ou seja, Sem argumentos


//        Em ForEach utiliza um Consumer, mas transformamos isso em Lambda ARGUMENTO -> CORPO
        listaSaudacao.forEach(saudacaoComando -> System.out.println(saudacaoComando));
    }
}
