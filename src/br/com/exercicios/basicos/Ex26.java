package br.com.exercicios.basicos;

/*
https://www.beecrowd.com.br/judge/pt/problems/view/1144
 */

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        sequenciaLogica(num);

    }

    public static void sequenciaLogica(int num) {
        int i=1;
        while(i<=num) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
            System.out.println(i + " " + (i*i+1) + " " + (i*i*i+1));
            i++;
        }

    }
}
