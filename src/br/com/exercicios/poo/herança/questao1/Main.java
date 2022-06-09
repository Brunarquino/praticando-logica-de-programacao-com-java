package br.com.exercicios.poo.herança.questao1;

import br.com.exercicios.poo.classes.questao2.Data;

public class Main {
    public static void main(String[] args) {

        VooFilha voo = new VooFilha(new Data(2, 7, 2022),"Jamaica", 100, 15);

        System.out.println(voo.tipo(85));
        //Apartir do 86 vagas são de fumantes
        System.out.println(voo.tipo(86));
        System.out.println(voo.tipo(100));

        voo.ocupa(voo.proximaLivre());


    }
}
