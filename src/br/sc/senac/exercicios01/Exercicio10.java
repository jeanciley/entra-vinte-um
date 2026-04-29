package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        int[] numeros = {7, 2, 7, 3, 7, 9, 7};

        int numero, contador = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                contador++;
            }
        }
        if (contador > 0)
            System.out.println("O número digitado aparece " + contador + " no array.");
        else
            System.out.println("O número digitado não aparece no array.");
    }
}
