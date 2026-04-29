package br.sc.senac.vetores;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + " nome: ");
            nomes[i] = leitor.next();
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        leitor.close();
    }
}
