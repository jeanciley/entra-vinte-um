package br.sc.senac.vetores.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        double[] notas = new double[4];
        double somaNotas = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a " + (i + 1) + " nota: ");
            notas[i] = leitor.nextDouble();
            somaNotas += notas[i];
        }

        System.out.println("A média das notas é: " + (somaNotas / notas.length));

        leitor.close();
    }
}
