import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String name = "Eduardo Silva";
        String tipoDaConta = "Corrente";
        double valorNaConta = 2500.00;

        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nnome do cliente: " + name);
        System.out.println("Tipo da conta: " + tipoDaConta);
        System.out.println("Valor na conta " + valorNaConta);
        System.out.println("\n*******************************\n");

        String menu = ("""
                    |===========================|
                    |1 - Consulta de saldo      |
                    |2 - Fazer transferencia    |
                    |3 - Receber valor          |
                    |4 - Sair                   |
                    |===========================|
                    """);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();


            if (opcao == 1) {
                System.out.println("o saldo atualizado é: " + valorNaConta);
            }
            else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitor.nextDouble();
                if (valor > valorNaConta) {
                    System.out.println("você não possui saldo suficiente para esta transferencia.");
                } else {
                    valorNaConta -= valor;
                    System.out.println("Novo saldo: " + valorNaConta);
                }
            }
            else if (opcao == 3) {
                System.out.print("Quanto vc deseja transferir?");
                double traferencia = leitor.nextDouble();
                valorNaConta += traferencia;
                System.out.println("novo saldo: " + valorNaConta);
            }
            else if (opcao != 4) {
                System.out.println("essa opção é inálida. Por favor insira uma das nossas opções.");
            }
        }

       }

    }


