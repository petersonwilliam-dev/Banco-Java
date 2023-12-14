package bancario;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
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
