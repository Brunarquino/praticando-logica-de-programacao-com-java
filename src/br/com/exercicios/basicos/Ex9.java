package br.com.exercicios.basicos;

//Sortiar um número aleatorio entre 1 e 1000
//Pedir um palpite para o usuario, se errar, informe se é o numero sortiadomaior ou menor

import java.util.Random;
import java.util.Scanner;

//Tente acertar o número entre 1

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("Sorteando um número aleatorio entre 1 e 1000...");
        int numeroSorteado = numeroAleatorio();
        System.out.println("Tente adivinhar o número que foi sorteado!");
        int palpite;
        do {
            System.out.println("De um palpite: ");
            palpite = scan.nextInt();
            tentativas++;
            if(palpite != numeroSorteado){
                System.out.println("\nPalpite errado!");
                if (numeroSorteado > palpite) System.out.println("O número sorteado é maior que o seu palpite");
                else System.out.println("O número sorteado é menor que seu palpite");
                System.out.println("Tente novamente!\n");
            }
        }while (palpite != numeroSorteado);


        System.out.println("\nAcertou no palpite!! " +
                "\nDepois de " + tentativas + " tenativas." +
                "\nO número sorteado é " + numeroSorteado);


    }

    private static int numeroAleatorio() {
        Random numAleatorio = new Random();
        int numero = numAleatorio.nextInt(1000);
        return numero;
    }
}
