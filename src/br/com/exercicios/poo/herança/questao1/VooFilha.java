package br.com.exercicios.poo.herança.questao1;

import br.com.exercicios.poo.classes.questao2.Data;
import br.com.exercicios.poo.classes.questao3.Voo;

public class VooFilha extends Voo {

    private int cadeirasFumentes, maxVagas;


    public VooFilha(Data data, String destino,int maxVagas,int cadeirasFumentes) {
        super(data, destino, maxVagas);
        this.cadeirasFumentes = cadeirasFumentes;
        this.maxVagas = maxVagas;
    }

    //Determina as cadeiras para fumantes
    public void setCadeirasFumentes(int cadeirasFumentes) {
        this.cadeirasFumentes = cadeirasFumentes;
    }

    //Determina maximo de vagas
    public void setMaxVagas(int maxVagas) {
        this.maxVagas = maxVagas;
    }

    public char tipo(int i){
        int primeiraVagaFumantes = maxVagas - cadeirasFumentes;
        if(i > primeiraVagaFumantes){
            return 'F';

        }else {
            return 'N';
        }

    }



}
