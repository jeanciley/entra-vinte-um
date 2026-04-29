package br.sc.senac.exercicios01;

public class Exercicio14 {
    public static void main(String[] args) {

        int[] numeros = {2, 3, 6, 4};
        boolean ordem = false;

        if (numeros[0] > numeros[1]){
            ordem = false;
        } else if (numeros[1] > numeros[2]) {
            ordem = false;
        } else if (numeros[2] > numeros[3]) {
            ordem = false;
        } else {
            ordem = true;
        }

        if (ordem == true){
            System.out.println("Está em ordem crescente.");
        } else {
            System.out.println("Não está em ordem crescente.");
        }
    }
}
