package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int idiomaSelecionado;

        System.out.print("Digite um número: ");
        idiomaSelecionado = reader.nextInt();

        switch (idiomaSelecionado) {
            case 1: {
                System.out.println("Welcome.");
                break;
            }
            case 2: {
                System.out.println("Bienvenido.");
                break;
            }
            case 3: {
                System.out.println("Ben venue.");
                break;
            }
            default:
                System.out.println("Bem vindo.");
        }

        reader.close();
    }
}
