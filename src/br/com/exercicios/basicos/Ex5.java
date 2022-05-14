package br.com.exercicios.basicos;

//Escreva um programa Java para trocar duas variáveis.

public class Ex5 {
    public static void main(String[] args) {

        //int

        int a = 2, b = 4;
        System.out.println("A: " + a + "\nB: " + b);
        System.out.println("Trocando o Valor de duas variaveis...");
        a = b ^ a;
        b = a ^ b;
        a = b ^ a;
        System.out.println("A: " + a + "\nB: " + b);

        //String
        System.out.println("\n");
        String c = "c", d = "d";
        System.out.println("C: " + c + "\nD: " + d);
        System.out.println("Trocando o Valor de duas variaveis...");
        String troca = c;
        c = d;
        d = troca;

        System.out.println("C: " + c + "\nD: " + d);



    }
}
