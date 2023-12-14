package bancario;
import users.User;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private List<Conta> contas;

    public Banco() {
        setContas(new ArrayList<>());
    }

    public Conta acessarConta(Scanner scanner) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite o número da sua conta (xxxxx-x): ");
        String numeroConta = scanner.nextLine();
        System.out.print("Digite o número da sua agência (xxx-x): ");
        String numeroAgencia = scanner.nextLine();

        for (Conta c : getContas()) {
            if (c.getNumeroConta().equals(numeroConta) && c.getNumeroAgencia().equals(numeroAgencia)) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Bem vindo, "+c.getUsuario().getNome());
                return c;
            }
        }

        return null;
    }

    public void criarConta(Scanner scanner) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        byte idade = scanner.nextByte();
        System.out.print("Digite o seu sexo [M/F]: ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.next();
        System.out.println("Digite o seu RG: ");
        String rg = scanner.next();

        User user = new User(nome, idade, sexo, cpf, rg);
        Conta conta = new Conta(user);

        adicionarConta(conta);
    }

    private void adicionarConta(Conta conta) {
        List listaContas = getContas();
        listaContas.add(conta);

        setContas(listaContas);

        System.out.println("======================");
        System.out.println("Olá, "+conta.getUsuario().getNome()+", sua conta foi criada com sucesso!");
        System.out.println("O número da sua conta é "+conta.getNumeroConta()+" e o número da agência é "+conta.getNumeroAgencia());
        System.out.println("======================");
    }

    public void excluirConta(Conta conta) {
        List listaContas = getContas();

        if (!listaContas.isEmpty()) {
            listaContas.remove(conta);
            System.out.println("======================");
            System.out.println("Pronto, "+conta.getUsuario().getNome()+"! Sua conta foi removida com sucesso!");
            System.out.println("======================");
        } else {
            System.out.println("Não há contas cadastradas");
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
