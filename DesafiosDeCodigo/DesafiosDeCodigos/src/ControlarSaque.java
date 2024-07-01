import java.util.Scanner;

/*Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária.
 O cliente pode fazer saques até atingir um limite diário predefinido.

*Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

*Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.*/
public class ControlarSaque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saque, limiteSaque;

        limiteSaque = scan.nextInt();
        for (int i = 1; ; i++ ){
            saque = scan.nextDouble();
            limiteSaque = limiteSaque-saque;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > limiteSaque) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                System.out.println("Saque realizado. Limite restante: " + limiteSaque);
            }
        }
        // Fechar o scanner para evitar vazamentos de recursos
        scan.close();
    }
}
