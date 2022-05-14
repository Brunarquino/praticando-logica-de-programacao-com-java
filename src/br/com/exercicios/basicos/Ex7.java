package br.com.exercicios.basicos;

import java.util.Scanner;

//IMC
public class Ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite seu Peso: ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);
        String categoria;

        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        }else if(imc < 24.9){
            categoria = "Peso Normal";
        }else if(imc < 29.9){
            categoria = "Sobrepeso";
        }else if(imc < 34.9){
            categoria = "Obesidade Grau I";
        }else if(imc < 39.9){
            categoria = "Obesidade Grau II";
        }else {
            categoria = "Obesidade Grau III";
        }

        System.out.println(imc);
        System.out.println(categoria);

        System.out.println("Nome: " + nome +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nIMC: " + imc +
                "\nCategoria: " + categoria);


    }
}
