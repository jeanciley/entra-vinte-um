package br.sc.senac.exercicios01;

public class Exercicio09 {
    public static void main(String[] args) {

        int[] numeros = {10, 77, 16, 22, 18, 2, 6, 3};
        int menor = 0, maior = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
                if (menor == 0){
                    menor = numeros[i];
                }
            } else if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O maior é: " + maior);
        System.out.println("O menor e: " + menor);
    }
}
