package br.com.exercicios.basicos;

/*
Escreva um programa que determine se uma cadeia de caracteres é um palíndromo ou não. Um alíndromo é uma cadeia que é
igual à sua inversa.

Exemplos:
            ASA = ASA (inverso) → é um PALÍNDROMO
            JOAO <> OAOJ (inverso) → não é um PALÍNDROMO
            343 = 343 (inverso) → é um PALÍNDROMO

*/

import javax.sound.midi.Soundbank;

public class Ex11 {
    public static void main(String[] args) {

        System.out.println(palindromo("ASA"));
        System.out.println(palindromo("JOAO"));
        System.out.println(palindromo("343"));
        System.out.println(palindromo("Asa"));

    }

    public static boolean palindromo(String cadeiaDeCaracteres){
        StringBuilder stringBuilder = new StringBuilder(cadeiaDeCaracteres);
        String inverso = String.valueOf(stringBuilder.reverse());
        cadeiaDeCaracteres = cadeiaDeCaracteres.toUpperCase();
        inverso = inverso.toUpperCase();
        if(cadeiaDeCaracteres.equals(inverso))return true;
        else return false;
    }
}
