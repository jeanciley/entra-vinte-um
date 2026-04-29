package br.sc.senac.exercicios01;

import java.util.Arrays;

public class Exercicio06 {
    public static void main(String[] args) {

        int[] arrayA = {10, 5, 6, 7, 8};
        int[] arrayB = new int[5];

        arrayB = arrayA;

        System.out.println(Arrays.toString(arrayB));
    }
}
