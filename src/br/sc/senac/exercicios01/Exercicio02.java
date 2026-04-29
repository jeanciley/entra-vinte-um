package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite um número: ");
        n1 = reader.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = reader.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = reader.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Pelo menos dois números são iguais.");
        } else {
            System.out.println("Nenhum número é igual.");
        }

        reader.close();
    }
}
