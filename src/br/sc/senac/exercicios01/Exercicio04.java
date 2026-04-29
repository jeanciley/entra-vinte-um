package br.sc.senac.exercicios01;

public class Exercicio04 {
    public static void main(String[] args) {

        int[] numeros = {2, 4, 5, 6, 7, 10, 22, 21, 30, 44};
        int pares = 0, impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i%2==0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("No array temos " + pares + " números pares e " + impares + " números ímpares.");
    }
}
