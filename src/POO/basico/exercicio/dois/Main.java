package POO.basico.exercicio.dois;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J. R. R. Tolkien";
        livro1.anoPublicacao = 1954;
        livro1.nimeroPaginas = 1568;

        System.out.println(livro1.ehLivroAntigo(livro1.anoPublicacao));
    }
}
