package br.sc.senac.vetores.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        String[] nomes = {"Jean", "Luigi", "Fernando", "Luana", "João", "Luis"};

        Scanner leitor = new Scanner(System.in);

        String buscador;

        System.out.printf("Digite um nome: ");
        buscador = leitor.next();

        for (String nome : nomes) {
            if (nome.equals(buscador)) {
                System.out.println("O nome está na lista!");
            }
        }

    }
}
