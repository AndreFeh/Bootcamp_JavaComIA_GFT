import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    //    TODO: Combina operadores do tipo T (Do mesmo tipo) e retorna um resultado desse mesmo tipo
    //     Usada para Operações com Redução em _Pares de Elementos_
    //        Como somar numeros ou Combinar objetos
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> numerosBinary = (num1, num2) -> num1 + num2;

        int totalNumeros = numeros.stream() /*Transforma a list numa Stream*/
                .reduce(0, numerosBinary);
        /**Esse Reduce é um for, que contem uma variavel temporaria
         *  Dentro dessa variavel, ele calcula o 1° numero com o 2° numero
         *  Pega o calculo e joga no "identity"(variavel temporaria) somando-a com o proximo do STREAM
         *  Ate terminar os elementos dentro do STREAM*/

        /*O desafio é mostrar os elementos da soma de todos os elementos dentro dessa List*/
        System.out.println("A soma dos elementos é: " + numerosBinary);
    }
}
