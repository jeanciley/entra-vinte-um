package br.sc.senac.exercicios01;

import java.util.Arrays;

public class Exercicio07 {
    public static void main(String[] args) {

        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};
        int[] arrayC = new int[3];

        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = (arrayA[i] + arrayB[i]);
        }

        System.out.println(Arrays.toString(arrayC));
    }
}
