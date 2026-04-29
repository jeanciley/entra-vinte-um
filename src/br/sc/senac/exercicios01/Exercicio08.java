package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Digite o nome do produto " + (i+1) + ": ");
            produtos[i] = leitor.next();
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i+1) + "- " + produtos[i]);
        }
        leitor.close();
    }
}
