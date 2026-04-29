package POO.encapsulamento.exemplo1;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            System.out.println("Não existe nome nulo!");
        } else {
            this.nome = nome;
        }
    }

    void apresentar(){
        System.out.println("Meu nome é " + this.nome + ".");
    }
}
