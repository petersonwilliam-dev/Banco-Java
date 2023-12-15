import java.util.Scanner;
import bancario.Banco;
import bancario.Conta;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        Conta contaLogada = null;

        while (true) {
            if (contaLogada == null) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Bem vindo ao banco");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("1 - Acessar minha conta");
                System.out.println("2 - Criar uma conta");
                System.out.println("3 - Sair");
                System.out.print("Digite a opção que deseja: ");
                byte opcao = scanner.nextByte();

                if (opcao == 1) {
                    contaLogada = banco.acessarConta();
                } else if (opcao == 2) {
                    banco.criarConta();
                } else {
                    break;
                }
            } else {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("1 - Consultar dados");
                System.out.println("2 - Depositar dinheiro");
                System.out.println("3 - Sacar dinheiro");
                System.out.println("4 - Deletar conta");
                System.out.println("5 - Sair");
                System.out.print("Digite qual opção você deseja: ");
                byte operacao = scanner.nextByte();

                switch (operacao) {
                    case 1:
                        contaLogada.exibiDados();
                        break;
                    case 2:
                        System.out.print("Digite o valor do depósito R$");
                        float valorDeposito = scanner.nextFloat();

                        contaLogada.depositarDinheiro(valorDeposito);
                        break;
                    case 3:
                        System.out.print("Digite o valor do depósito R$");
                        float valorSaque = scanner.nextFloat();

                        contaLogada.sacarDinheiro(valorSaque);
                        break;
                    case 4:
                        banco.excluirConta(contaLogada);
                        contaLogada = null;
                        break;
                    default:
                        contaLogada = null;
                }
            }
        }
        System.out.println("Saindo... Até mais!");
        scanner.close();
    }
}