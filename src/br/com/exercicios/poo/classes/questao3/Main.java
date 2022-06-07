package br.com.exercicios.poo.classes.questao3;

import br.com.exercicios.poo.classes.questao2.Data;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo(new Data(1, 5, 2023), "México");

        voo.ocupa(0);
        voo.ocupa(0);

        for(int i = 0; i < 16 ;i++){
            voo.ocupa(voo.proximaLivre());
        }

        System.out.println(voo);


    }

}
