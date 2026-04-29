package br.sc.senac;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a, b;

        System.out.printf("Digite um número: ");
        a = leitor.nextInt();

        System.out.printf("Digite outro número: ");
        b = leitor.nextInt();

        try {
            double div = a / b;
            System.out.println(div);
        } catch (ArithmeticException exception){
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
