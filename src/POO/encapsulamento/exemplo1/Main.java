package POO.encapsulamento.exemplo1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(null);
        pessoa.setNome(" ");
        pessoa.apresentar();
    }
}
