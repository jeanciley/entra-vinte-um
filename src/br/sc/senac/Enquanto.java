package br.sc.senac;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = leitor.nextInt();

        while (true) {
            if (num < 0) {
                break;
            } else {
                System.out.print("Digite um número: ");
                num = leitor.nextInt();
            }
        }
    }
}
