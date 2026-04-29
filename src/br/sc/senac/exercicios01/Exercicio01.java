package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        int num;

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = reader.nextInt();

        if (num > 0){
            System.out.println("Positivo.");
        } else if (num < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Zero.");
        }

        reader.close();

    }
}
