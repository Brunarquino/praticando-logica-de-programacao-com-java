package br.com.exercicios.basicos;

import java.util.Scanner;

//contar quantos números pares e impares um numero de 4 ou três digitos tem

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean sair;
        int numero;

        do {

            System.out.println("Digite o número de no mínimo 3 ou no maximo 4 Dígitos: ");
            numero = scan.nextInt();

            if(numero < 100 | numero > 9999){
                sair = false;
                System.out.println("Número Invalido!");
            }else{
                sair = true;
            }

        }while (sair == false);
        int numerosPares = 0;
        int numerosImpares = 0;
        String s = String.valueOf(numero);

        //Percorendo pela String
        for (int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            int num = Integer.parseInt(String.valueOf(c));

            if(num % 2 == 0){
                numerosPares++;
            }else {
                numerosImpares++;
            }

        }

        System.out.println("O número " + numero + " tem " + numerosPares + " pares e " + numerosImpares + " impares!" );


    }

}
