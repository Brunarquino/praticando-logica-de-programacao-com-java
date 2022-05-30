package br.com.exercicios.basicos;
/*
Escreva um módulo para calcular as raízes de uma equação de 2° grau. O módulo receber as
constantes A, B e C da equação como parâmetro e retorna três valores: 2 raízes e um STATUS, seguindo os
critérios:
- se houverem duas raízes retorna status 2;
- se houver uma raiz apenas retorna status 1 e um dos parâmetros de raiz igual a 0;
- se não houverem raízes retorna status 0 e os dois parâmetros de raiz igual a 0.

*/
public class Ex12 {
    public static void main(String[] args) {


        System.out.println(equacaoSegundoGrau(5, -3, 2));
        System.out.println(equacaoSegundoGrau(1, -1, 12));
        System.out.println(equacaoSegundoGrau(9, -12, 4));
        System.out.println(equacaoSegundoGrau(4, -4, 1));

        //equacaoSegundoGrau(2, 4, 6);

    }

    public static String equacaoSegundoGrau(double A, double B, double C){
        String status = "";
        double delta, x,raiz1 = 0, raiz2 = 0;

        delta = ((B*B) - (4*A*(numeroNegativo(C))));


        if(delta > 0){

            status = "2";
            int raizQuadrada = raizQuadrada(delta);

            raiz1 = ((-1*(B)) + (raizQuadrada/(2*A)));
            raiz2 = ((-1*(B)) - (raizQuadrada/(2*A)));

        } else if (delta == 0) {
            status = "2";
            raiz1 = ((-1*(B)) + (0/(2*A)));
            raiz2=0;

        }else{
            status = "0";
            raiz1 = 0;
            raiz2 = 0;
        }
        return raiz1 + " " + raiz2 + " " + status;
    }

    private static int raizQuadrada(double delta) {
        int raiz=0, impares = 1;

        do {
            if(delta == 0 )break;


            delta -= impares;
            impares += 2;
            raiz++;


        }while (delta > 0);

        return raiz;
    }

    public static double numeroNegativo(double num){
        return num-(2*num);
    }

}
