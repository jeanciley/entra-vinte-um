package POO.basico.exercicio.tres;

public class Main {
    public static void main(String[] args) {

        Cachorro pequeno = new Cachorro("Auau", "Pincher", 15, 5.2);
        Cachorro medio = new Cachorro("Dog", "Bulldog", 7, 17.6);
        Cachorro grande = new Cachorro("Pequeno", "Pitbull", 5, 37.5);

        pequeno.exibirInformacoes();
        System.out.println("--------------");
        medio.exibirInformacoes();
        System.out.println("--------------");
        grande.exibirInformacoes();
    }
}
