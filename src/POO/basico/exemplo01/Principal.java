package POO.basico.exemplo01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Pessoa jean = new Pessoa("Jean", 30);

        //jean.apresentar();

        Pessoa luigi = new Pessoa("Luigi", 25);

        //luigi.apresentar();

        Carro carro1 = new Carro();
        System.out.print("Digite o nome do dono do carro: ");

        Scanner leitor = new Scanner(System.in);

        carro1.dono = leitor.next();
        carro1.marca = "Chevrolet";
        carro1.modelo = "Tracker";
        carro1.ano = 2025;
        carro1.cor = "Cinza";

        carro1.caractersticas();


    }
}
