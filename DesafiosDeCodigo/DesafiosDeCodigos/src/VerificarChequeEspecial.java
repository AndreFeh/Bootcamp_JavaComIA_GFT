import java.util.Scanner;

/*
Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque
 especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá
 o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

* Entrada
O programa solicitará ao usuário que informe o saldo atual da conta bancária.
Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.

* Saída
O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.

Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.

Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial
(definido como 500 unidades monetárias).

Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.*/
public class VerificarChequeEspecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldoAtual, saque, limite=500, chequeEspec;

        saldoAtual = scan.nextDouble();
        saque = scan.nextDouble();
        chequeEspec = saldoAtual+limite;

        if (saque <= saldoAtual){
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= chequeEspec) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else if(saque > chequeEspec) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
        scan.close();
    }
}
