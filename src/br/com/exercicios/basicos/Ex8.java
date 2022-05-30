package br.com.exercicios.basicos;

//Informar de o número inteiro que o usuario escreveu é primo ou não

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int divisores = 0;
        int i = 1;
        System.out.println("Qual número deseja saber se é um número primo?");
        int numero = scan.nextInt();
        divisores = getDivisores(numero, divisores, i);

        if (divisores > 2){
            System.out.println(numero + " não é um numero primo!" );
        }else {
            System.out.println(numero + " é um numero primo!" );
        }


    }

    //retorna a quantidade de divisores
    private static int getDivisores(int numero, int divisores, int i) {
        do{
            if(numero % i == 0){
                divisores++;
            }
            if(i == numero) break;

            i++;
        }while (divisores == 1 | divisores == 2);
        return divisores;
    }
}
