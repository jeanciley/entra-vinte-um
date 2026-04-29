package POO.basico.exercicio.um;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Jean";
        pessoa.idade = 17;

        System.out.println(pessoa.ehMaiorDeIdade(pessoa.idade));

    }
}
