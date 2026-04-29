package POO.encapsulamento.exercicios.tres;

public class Identidade {
    private String cpf;
    private String nome;

    public Identidade(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
