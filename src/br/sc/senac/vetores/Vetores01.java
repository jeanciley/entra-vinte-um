package br.sc.senac.vetores;

import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] idades = new int[3];

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a idade: ");
            idades[i] = reader.nextInt();
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
