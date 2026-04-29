package br.sc.senac.exercicios01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        String[] nomes = {"Jean", "Luana", "Bruna", "Juliana", "Luigi", "Fernando"};

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um nome: ");
        String nome = leitor.next();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == nome){
                System.out.println("O nome está no vetor.");
            }
        }

        leitor.close();
    }
}
