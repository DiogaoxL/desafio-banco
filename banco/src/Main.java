import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double saldo = 2500.00;
        double valorParaReceber = 0;
        double transferirValor = 0;

        String dadosCliente = """
                ***********************
                 Dados iniciais do cliente:
                 
                 Nome: Jacqueline Oliveira
                 Tipo conta: Corrente
                 Saldo inicial: R$ 2500,00
                 ***********************
                """;

        String mensagemOperacoes = """
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Qual operação deseja realizar?
                """;

        System.out.print(dadosCliente + mensagemOperacoes);
        int op = sc.nextInt();

        while(op != 4){

            switch (op){
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;

                case 2:
                    System.out.println("Qual valor você vai receber?");
                    valorParaReceber = sc.nextDouble();
                    saldo = saldo + valorParaReceber;
                    System.out.println("Seu saldo atualizado é: " + saldo);
                    break;

                case 3:
                    System.out.println("Qual valor você vai transferir?");
                    transferirValor = sc.nextDouble();

                    if(transferirValor > saldo ){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }else{
                        saldo = saldo - transferirValor;

                        System.out.println("Seu saldo atualizado é: " + saldo);
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
            }

            mensagemOperacoes = """
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Qual operação deseja realizar?
                """;

            System.out.print(mensagemOperacoes);
            op = sc.nextInt();
        }

        System.out.println("Programa encerrado!");




    }
}