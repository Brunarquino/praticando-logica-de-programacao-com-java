package br.com.exercicios.poo.classes.questao6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        VetorOrdenado vetor1 = new VetorOrdenado();
        vetor1.insert("b");
        vetor1.insert("a");
        vetor1.insert("c");
        vetor1.insert("f");
        vetor1.insert("z");
        System.out.println(Arrays.toString(vetor1.getVetores()));

        VetorOrdenado vetor2 = new VetorOrdenado();
        vetor2.insert("g");
        vetor2.insert("t");
        vetor2.insert("h");
        vetor2.insert("k");
        vetor2.insert("m");
        System.out.println(Arrays.toString(vetor2.getVetores()));

        VetorOrdenado mergeVetores = vetor1.merge(vetor2);
        System.out.println(Arrays.toString(mergeVetores.getVetores()));


    }
}
