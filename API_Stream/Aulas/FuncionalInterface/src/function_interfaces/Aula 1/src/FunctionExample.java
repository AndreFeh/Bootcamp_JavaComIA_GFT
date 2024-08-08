import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
//        Pega um Tipo de Argumento e retorna Esse ou Outro tipo de saida
//        Mapeia elementos dentro de uma Stream de outros valores

        List<Integer> valoresInt = Arrays.asList(1, 2, 4, 6, 4);

//        1° TIPO DE ENTRADA DEPOIS UM TIPO DE SAIDA
        Function<Integer, Integer> dobrarInt = numero -> numero * 2;

        List<Integer> numerosDobrados = valoresInt.stream().map(dobrarInt).toList();

        numerosDobrados.forEach(x -> System.out.println(x));
//        TODO: ISSO SE EU SEI FAZER A IMPLEMMENTACAO DE UMA FUNCTION
//            Para implementa-lo dentro do Map
/*      List<Integer> numerosDobrados2 = valoresInt.stream().map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer numero) {
                return numero * 2;
            }
        }).toList(); */
    }
}
