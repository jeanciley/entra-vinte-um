package br.sc.senac.vetores;

import java.util.ArrayList;

public class vetores02 {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        char[] carctere = new char[5];

        boolean[] logico = new boolean[5];

        ArrayList<String> notasFiscais = new ArrayList<>();

        notasFiscais.add("123456");
        notasFiscais.add("123456");
        notasFiscais.add("123456");

        for (String notaFiscal : notasFiscais) {
            System.out.println(notaFiscal);
        }
    }
}
