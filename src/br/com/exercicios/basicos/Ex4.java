package br.com.exercicios.basicos;

import java.util.Scanner;

//Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo: ");
        double altura = scan.nextDouble();
        System.out.println("Digite a largura do retangulo: ");
        double largura = scan.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println("A área desse retangula é de " + area);
        System.out.println("O perímetro desse retangula é de " + perimetro);


    }

}
