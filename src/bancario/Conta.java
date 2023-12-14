package bancario;
import java.util.Random;
import users.User;

public class Conta {
    private User usuario;
    private String numeroConta;
    private String numeroAgencia;
    private float saldoConta;

    public Conta(User usuario) {
        setUsuario(usuario);
        setNumeroConta(gerarNumeroConta());
        setNumeroAgencia(gerarNumeroAgencia());
        setSaldoConta(0);
    }

    public void depositarDinheiro(float valor) {
        setSaldoConta(getSaldoConta() + valor);
    }

    public void sacarDinheiro(float valor) {
        if (getSaldoConta() >= valor) {
            setSaldoConta(getSaldoConta() - valor);
        } else {
            System.err.println("SALDO INSUFICIENTE!");
        }
    }

    private String gerarNumeroConta() {
        Random rand = new Random();

        int numero = rand.nextInt(100000);
        int digito = rand.nextInt(10);

        String numeroConta = numero+"-"+digito;

        if (numeroConta.length() < 7) {
            int numerosRestantes = 7 - numeroConta.length();

            for (int i = 0; i < numerosRestantes; i++) {
                numeroConta = "0" + numeroConta;
            }
        }

        return numeroConta;
    }

    private String gerarNumeroAgencia() {
        Random rand = new Random();

        int numero = rand.nextInt(1000);
        int digito = rand.nextInt(10);

        String numeroAgencia = numero+"-"+digito;

        if (numeroAgencia.length() < 5) {
            int numerosRestantes = 5 - numeroAgencia.length();

            for (int i = 0; i < numerosRestantes; i++) {
                numeroAgencia = "0" + numeroAgencia;
            }
        }

        return numeroAgencia;
    }

    public User getUsuario() {
        return this.usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
}
