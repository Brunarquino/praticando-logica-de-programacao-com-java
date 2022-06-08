package br.com.exercicios.poo.classes.questao6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VetorOrdenado {
    private String[] vetores;

    //Tamanho do vetor pré definido, para evitar erros
    public VetorOrdenado() {
        this.vetores = new String[1];
    }

    private VetorOrdenado(String[] vetores) {
        this.vetores = vetores;
    }



    public void insert(String str){
        boolean aumentarVariavel = true;
        for (int i = 0; i < vetores.length; i++) {
            if(vetores[i] == null){
                vetores[i] = str;
                aumentarVariavel = false;
                break;
            }
        }
        if(aumentarVariavel){
            int tamanhoVetor = this.vetores.length;
            tamanhoVetor++;
            String[] vetorClone = new String[tamanhoVetor];

            for (int i = 0; i < vetores.length; i++){
                vetorClone[i] = this.vetores[i];
            }

            this.vetores = new String[tamanhoVetor];
            this.vetores = vetorClone;
            tamanhoVetor--;
            this.vetores[tamanhoVetor] = str;
        }

        ordernarVetor(this.vetores);

    }

    private void ordernarVetor(String[] vetores) {
        List<String> lista = Arrays.asList(vetores);
        Collections.sort(lista);
        for(int i = 0; i < lista.size(); i++)
            vetores[i] = lista.get(i);
    }

    public VetorOrdenado merge(VetorOrdenado vetorCorrente) {
        int tamVetor1 = this.vetores.length;
        int tamVetor2 = vetorCorrente.vetores.length;
        String[] vetorMerge = new String[tamVetor1 + tamVetor2];
        System.arraycopy(this.vetores, 0, vetorMerge, 0, tamVetor1);
        System.arraycopy(vetorCorrente.vetores, 0, vetorMerge, tamVetor1, tamVetor2);

        ordernarVetor(vetorMerge);

        return new VetorOrdenado(vetorMerge);
    }

    public String[] getVetores() {
        return vetores;
    }


}
