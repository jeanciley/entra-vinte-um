package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        int[] numeros = {2, 4, 15, 3};
        double constante;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor constante: ");
        constante = leitor.nextDouble();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x " + constante + " = " + (numeros[i] * constante));
        }
    }
}
