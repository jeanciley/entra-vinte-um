package POO.encapsulamento.exemplo3;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("1", 2);
        Estudante estudante1 = new Estudante("2");

        estudante.adicionarNota(0, 10);
        estudante.adicionarNota(1, 7);

        estudante1.adicionarNota(0, 5);

        System.out.println(estudante.calcularMedia());
    }
}
