package br.com.exercicios.poo.classes.questao5;

public class Vetor {

    private String[] vetores;

    public Vetor(int tamanhoVetor) {
        this.vetores = new String[tamanhoVetor];
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


    }

    public String getVetores(int indice) {
        return vetores[indice];
    }

    public int size(){
        int v=0;

        for (int i = 0; i < vetores.length; i++) {
            if(vetores[i] != null){
                v++;
            }
        }

        return v;
    }
}
