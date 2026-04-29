package br.sc.senac.vetores.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int[] idades = new int[7];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite uma idade: ");
            idades[i] = leitor.nextInt();
        }

        for (int idade : idades){
            System.out.println(idade);
        }

    }
}
