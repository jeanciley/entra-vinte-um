package br.sc.senac.exercicios01;

import java.util.Arrays;

public class Exercicio11 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1);
        }
        System.out.println(Arrays.toString(numeros));
    }
}
