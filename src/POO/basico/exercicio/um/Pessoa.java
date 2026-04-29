package POO.basico.exercicio.um;

public class Pessoa {
    String nome;
    int idade;

    boolean ehMaiorDeIdade(int idade){
        if (idade >= 18){
            return true;
        } else {
            return false;
        }
    }
}
