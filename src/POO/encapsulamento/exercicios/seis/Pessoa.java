package POO.encapsulamento.exercicios.seis;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150){
            this.idade = idade;
        } else {
            System.out.println("Erro! Idade inválida.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }
    }
}
