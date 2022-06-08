package br.com.exercicios.poo.classes.questao5;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);
        vetor.insert("teste 1");
        System.out.println(vetor.getVetores(0));
        vetor.insert("teste 2");
        System.out.println(vetor.getVetores(1));

        //Vetores além do valor inicial
        //Expandndo tamanho do vetor
        vetor.insert("teste 3");
        System.out.println(vetor.getVetores(2));
        vetor.insert("teste 4");
        System.out.println(vetor.getVetores(3));
        vetor.insert("teste 5");
        System.out.println(vetor.getVetores(4));

        System.out.println(vetor.size() + " vetores estão preechidos");



//        //TESTANDO MÉTODO SIZE em outras situações
//        Vetor vetor = new Vetor(15);
//        vetor.insert("teste 1");
//        vetor.insert("teste 2");
//        vetor.insert("teste 3");
//        vetor.insert("teste 4");
//        vetor.insert("teste 5");
//        vetor.insert("teste 6");
//
//        System.out.println(vetor.size() + " vetores estão preechidos");


    }





}
