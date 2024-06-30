import java.util.Scanner;

/*
* Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir
ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

* Entrada
O programa exibirá um menu com as seguintes opções:

Depositar
Sacar
Consultar Saldo
Encerrar
O usuário escolherá uma dessas opções digitando o número correspondente.

* Se o usuário escolher:

1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a
mensagem "Saldo atual: {saldo com 1 casa decimal}".
2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo
atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
0: O programa encerrará, imprimindo "Programa encerrado.".

*/
public class OperacaoBancariasSimples {
    public static void main(String[] args) {
        double valor = 0, saque, deposito;
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);

        while (continuar) {
            int opcao = leitor.nextInt();

            switch(opcao){
                case 1: /*Deposito*/
//                    System.out.println("Digite O Valor A Ser Depositado");
                    deposito = leitor.nextDouble();
                    valor= valor+deposito;
                    System.out.printf("Saldo atual: %.1f%n", valor);
                    break;
                case 2: /*Saque*/
//                    System.out.println("Digite O Valor Que Quer Sacar");
                    saque = leitor.nextDouble();
                        valor = valor-saque;
                    if (valor >=0){
                        System.out.printf("Saldo atual: %.1f%n", valor);
                    } else System.out.println("Saldo insuficiente.");
                    break;
                case 3: /*Consulta*/
                    System.out.printf("Saldo atual: %.1f%n", valor);
                    break;
                case 0: /*Sair*/
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        leitor.close();
    }
}