package br.com.exercicios.basicos;

//Sabendo a quantidade de digitos de um Double

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber a quantidade de digitos: ");
        double d = scan.nextDouble();
        System.out.println(quantidadeDigitos(d));
    }

    private static int quantidadeDigitos(double d) {
        String i2 = String.valueOf(d);

        int quantidadeDigitosDepoisVirgula = (i2.length() - i2.indexOf(".")) - 1;
        int quantidadeDigitosAntesVirgula = i2.indexOf(".");
        System.out.println(d);
        System.out.println("Qauntidade De números Antes da virgula: " + quantidadeDigitosAntesVirgula);
        System.out.println("Quantidade De números Depois da virgula: " + quantidadeDigitosDepoisVirgula);

        return quantidadeDigitosDepoisVirgula + quantidadeDigitosAntesVirgula;
    }
}
