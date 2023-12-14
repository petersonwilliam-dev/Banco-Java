package users;

public class User {
    private String nome;
    private byte idade;
    private char sexo;
    private String cpf;
    private String rg;

    public User(String nome, byte idade, char sexo, String cpf, String rg) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setCpf(cpf);
        setRg(rg);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return this.idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
