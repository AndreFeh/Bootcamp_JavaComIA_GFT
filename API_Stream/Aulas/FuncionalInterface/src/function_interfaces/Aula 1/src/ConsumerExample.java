import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
//        CRIANDO UMA LIST ARRAY COM 5 NUM. LIST <T> QUALQUER TIPO
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//        BIBLIOTECA CONSUMER COM LAMBDA PARA BUSCAR PARES
        Consumer<Integer> numerosPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

//        FOR EACH IRA IMPRIMIR
//        QUANDO USADO NUMEROS.STREAM, ELE IRA TORNAR CADA NUMERO UMA STREAM PARA SER CHAMADO PELO CONSUMER
//        numeros.stream().forEach(numerosPar);

// TODO       SE EU NAO SEI IMPLEMENTAR UM CONSUMER
// TODO       QUANDO COLOCA O MOUSE EM CIMA DE UM FOREAC, ELE MOSTRA QUE CHAMA UM CONSUMER

//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer par) {
//                if (par%2==0){
//                    System.out.println(par);
//                }
//            }
//        });

//        UTILIZANDO LAMBDA --- DE UM LADO O ARGUMENTO, DO OUTRO O CORPO
        numeros.forEach(par -> {
                if (par%2==0){
                    System.out.println(par);
                }
        });
//        Com reference Mathods
/**        numeros.forEach(System.out::println);*/

    }
}