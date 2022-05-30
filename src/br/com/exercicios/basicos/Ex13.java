package br.com.exercicios.basicos;

/*
Escreva uma função que receba como parâmetro um número inteiro relativo a um mês do ano e
retorne uma string com o nome deste mês por extenso. Resolva o problema de suas maneiras:
- sem um vetor, através de uma estrutura switch/case;
- com um vetor.

ADD OUTRAS MANEIRAS...
- com um map
- com um list

set não tem como pegar pelo indice
 */

import java.util.*;

public class Ex13 {
    public static void main(String[] args) {

        int num = 0;

        System.out.println("\t---------- FUNÇÃO COM SWITCH ----------\t");
        System.out.println(num + " é relativo a: " + mesSwitch(num));
        System.out.println("\n");

        System.out.println("\t---------- FUNÇÃO COM VETOR ----------\t");
        System.out.println(num + " é relativo a: " + mesVetor(num));
        System.out.println("\n");

        System.out.println("\t---------- FUNÇÃO COM MAP ----------\t");
        System.out.println(num + " é relativo a: " + mesMap(num));
        System.out.println("\n");

        System.out.println("\t---------- FUNÇÃO COM LIST ----------\t");
        System.out.println(num + " é relativo a: " + mesList(num));
        System.out.println("\n");


    }

    private static String mesSwitch(int i) {
        String mes="";
        switch (i){
            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
            default:
                mes = "Não Existe";
                break;
        }
        return mes;
    }

    private static String mesVetor(int i) {
        String[] mes = {"Janeiro", "Feveriro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return mes[i];
    }

    private static String mesMap(int i) {
        Map<Integer, String> messes = new HashMap<>(){{
            put(0, "Janeiro");
            put(1, "Fevereiro");
            put(2, "Março");
            put(3, "Abril");
            put(4, "Maio");
            put(5, "Junho");
            put(6, "Julho");
            put(7, "Agosto");
            put(8, "Setembro");
            put(9, "Outubro");
            put(10, "Novembro");
            put(11, "Dezembro");
        }};

        if(messes.containsKey(i)){
            for (Map.Entry<Integer, String> mes :messes.entrySet()){
                if(mes.getKey().equals(i)){
                    return mes.getValue();
                }
            }
        }else return "Não Existe";

        return null;
    }

    private static String mesList(int i) {


        List<String> messes = new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
            add("Julho");
            add("Agosto");
            add("Setembro");
            add("Outubro");
            add("Novembro");
            add("Dezembro");
        }};

        boolean existe = false;

        for (String mes : messes) {
            if(messes.indexOf(mes) == i){
                existe = true;
                return mes;
            }
        }

        if(existe == false) return "NãoExiste";

        return null;
    }

}
