package br.com.exercicios.basicos;

import java.util.Scanner;

/*Contando a quantidade de digtos de um int*/

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber a quantidade de digitos: ");
        int i = scan.nextInt();
        System.out.println(quantidaDigitos(i));
    }
    private static int quantidaDigitos(int i) {
        String i2 = String.valueOf(i);
        return i2.length();
    }
}
