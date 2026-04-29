package br.sc.senac;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.print("Digite seu nome: ");
        String nome;
        nome = teclado.next();
        System.out.println("Seu nome é " + nome + ".");

    }
}
