import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacao = 0;
        double saldo = 2500;
        double recebeValor = 0;
        double transfereValor = 0;
        System.out.println("""
                 *************************
                 Dados inciais do cliente:
                                 
                 Nome: Caio Martins
                 Saldo inicial: R$ 2.500,00
                ***************************
                                  
                 """);
        System.out.println("Digite a operação desejada:");
        while (operacao != 4) {
            System.out.println("""
                     
                     1-Consultar saldo
                     2-Receber valor
                     3-Transferir valor
                     4-Sair
                    """);
            operacao = sc.nextInt();
            if (operacao == 1) {
                System.out.println("Saldo atual: " + saldo);
            }
            if (operacao == 2) {
                System.out.println("Digite o valor a receber: ");
                recebeValor = sc.nextDouble();
                saldo += recebeValor;
            }
            if (operacao == 3) {
                System.out.println("Digite o valor a transferir: ");
                transfereValor = sc.nextDouble();
                if (transfereValor > saldo) {
                    System.out.println("Não há saldo suficiente para essa operação.");
                } else {
                    saldo -= transfereValor;
                }

            }
            if (operacao > 4) {
                System.out.println("Operação inválida!");
            }
        }


    }
}