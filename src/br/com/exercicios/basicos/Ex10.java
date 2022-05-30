package br.com.exercicios.basicos;

/*
Fazer um programa para medir os reflexos do usuário. O programa deve:
    • Mostrar a palavra “Agora!” após um tempo aleatório e um número, também aleatório

    • Contar o tempo até que o usuário digite o número pedido e mostrar esse tempo.

    • Dicas: usar o método getTimeInMillis da classe Calendar ou o método nanoTime da classe System.

*/

import java.util.Calendar;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        /*

        Calendar calndr1 = Calendar.getInstance();
        Calendar calndr2 = Calendar.getInstance();
        long tempoInicial;
        long tempoFinal;

        System.out.println("Quando falar agora digite o número 1");
        Thread.sleep(6000);
        System.out.println("Agora!");
        tempoInicial = calndr1.getTimeInMillis();
        int numero = scan.nextInt();
        tempoFinal = calndr2.getTimeInMillis();

        long tempo = tempoFinal - tempoInicial;
        System.out.println(tempoInicial);
        System.out.println(tempoFinal);
        System.out.println("demorou "  + tempo + " milisegundos");

         */


        System.out.println("Quando falar agora digite o número 1");
        Thread.sleep(6000);
        System.out.println("Agora!");
        long stat = System.nanoTime();
        scan.nextInt();
        long stop = System.nanoTime();

        System.out.println(stat + " " + stop);

        System.out.println(stop - stat);




    }
}
