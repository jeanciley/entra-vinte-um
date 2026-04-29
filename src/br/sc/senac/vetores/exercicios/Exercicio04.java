package br.sc.senac.vetores.exercicios;

public class Exercicio04 {
    public static void main(String[] args) {

        int[] numeros = {10, 5, 6, 3, 7, 9, 5, 4, 6, 1};

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é PAR!");
            } else {
                System.out.println(numero + " é IMPAR!");
            }
        }
    }
}
