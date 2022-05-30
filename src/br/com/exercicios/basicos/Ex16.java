package br.com.exercicios.basicos;

/*

https://www.beecrowd.com.br/judge/pt/problems/view/1015

 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        double x1 = 0, x2 = 0, y1 = 0, y2 = 0;

//        Scanner scan = new Scanner(System.in);
//        String valoresP1 = scan.nextLine();
//        String[] p1 = valoresP1.split(" ", 2);
//
//        for (String valores : p1){
//            if(valores == p1[0]) x1 = Double.parseDouble(valores);
//            if(valores == p1[1]) y1 = Double.parseDouble(valores);
//        }
//
//        String valoresP2 = scan.nextLine();
//        String[] p2 = valoresP1.split(" ");
//
//        for (String valores : p2){
//            if(valores == p2[0]) x2 = Double.parseDouble(valores);
//            if(valores == p2[1]) y2 = Double.parseDouble(valores);
//        }

        x1 = 1.0;
        y1 = 7.0;

        x2 = 5.0;
        y2 = 9.0;

        Double conta = (((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
        System.out.println((x2 - x1));
        System.out.println((x2 - x1));
        System.out.println((x2 - x1)*(x2 - x1));
        System.out.println(conta);
        Double distancia = raizQuandrada(conta);

        System.out.println("A distancia é de " + distancia);



    }

    private static Double raizQuandrada(double v) {
        double raiz=0;
        int impares = 1;

        do {
            if(v == 0 )break;

            v -= impares;
            impares += 2;
            raiz++;


        }while (v > 0);

        return raiz;
    }
}
