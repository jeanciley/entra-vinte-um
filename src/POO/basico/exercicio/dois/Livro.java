package POO.basico.exercicio.dois;

public class Livro {

    String titulo;
    String autor;
    int nimeroPaginas;
    int anoPublicacao;

    boolean ehLivroAntigo(int anoPublicacao){
        return anoPublicacao < 2007;
    }
}
