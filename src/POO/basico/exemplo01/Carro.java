package POO.basico.exemplo01;

public class Carro {

    String cor;
    String modelo;
    String marca;
    int ano;
    String dono;

    void ligar() {
        System.out.println("vruuum");
    }

    void caractersticas() {
        System.out.println("Dono: " + this.dono);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }
}
