package br.com.exercicios.basicos;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja converter em binario");
        int numero = scan.nextInt();
        String binario = binario(numero);
        System.out.println(binario);
    }

    //Método que retorna um bínario
    private static String binario(int numero) {
        int resto;
        String binario = "";
        do {
            resto = numero % 2;
            binario = resto + binario;
            numero = numero /2;
        }while (numero != 1);
        binario = "1" + binario;
        return binario;
    }
}
