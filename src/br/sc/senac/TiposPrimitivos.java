package br.sc.senac;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos de número inteiro
        byte numeroMuitoPequeno = 12;
        short numeroPequeno = 1000;
        int numeroNormal = 123549899;
        long numeroGrandao = 999999999;

        System.out.println(numeroMuitoPequeno);
        System.out.println(numeroPequeno);
        System.out.println(numeroNormal);
        System.out.println(numeroGrandao);
        System.out.println("-----------------------");

        //Tipos de números reais
        float numeroBurro = 24.6f;
        double numeroReal = 12300.589;
        System.out.println(numeroBurro);
        System.out.println(numeroReal);
        System.out.println("-----------------------");
        //Char e Boolean
        char caractere = 'J';
        boolean verdade = true;
        boolean falso = false;
        System.out.println(caractere);
        System.out.println(verdade);
        System.out.println(falso);
    }
}
