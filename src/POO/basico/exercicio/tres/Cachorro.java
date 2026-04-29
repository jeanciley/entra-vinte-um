package POO.basico.exercicio.tres;

public class Cachorro {

    String nome;
    String raca;
    int idade;
    double peso;

    public Cachorro(String nome, String raca, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    void exibirInformacoes(){
        System.out.println("Nome: " + this.nome + ".");
        System.out.println("Raça: " + this.raca + ".");
        System.out.println("Idade: " + this.idade + ".");
        System.out.println("Peso: " + this.peso + ".");
        System.out.println("Porte: " + classificarTamanho(this.peso));
    }

    private String classificarTamanho(double peso) {
        if (peso < 15){
            return "Pequeno.";
        } else if (peso > 15 && peso < 30) {
            return "Médio.";
        } else {
            return "Grande.";
        }
    }
}
