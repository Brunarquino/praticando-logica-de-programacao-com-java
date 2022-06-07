package br.com.exercicios.poo.classes.questao3;

import br.com.exercicios.poo.classes.questao2.Data;

import java.util.Arrays;
import java.util.Date;

public class Voo {

    private int numero;
    private Data data;
    private String destino;
    boolean[] cadeiras;

    private static int SEQUENCIAL = 00001;

    public Voo(Data data, String destino) {
        this.numero = SEQUENCIAL++;
        this.data = data;
        this.destino = destino;
        cadeiras = new boolean[100];
    }

    public int proximaLivre(){
        int i = 0;
        for (boolean cadeira: cadeiras) {
            if(!cadeira){
                System.out.println("A " + (i + 1) + "° CADEIRA QUE PODE SER OCUPADA" );
                return i;
            }
            i++;
        }
        return i;
    }

    public boolean verifica(int i){
        if(cadeiras[i]) return true;
        else return false;
    }

    public void ocupa(int i){
        if(verifica(i)) {
            System.out.println("CADEIRA JÁ ESTÁ OCUPADA!");
        }else {
            System.out.println("OCUPANDO CADEIRA..." );
            cadeiras[i] = true;
        }
    }
    public int vagas(){
        int vagas = 0;

        for (boolean cadeira: cadeiras) {
            if(!cadeira){
                vagas++;
            }
        }
        return vagas;
    }

    public Voo clone() {
        return new Voo(this.data,this.destino);
    }

    public int getNumero() {
        return numero;
    }
    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "===============================" +
                "\nVÔO: " + this.numero +
                "\nDESTINO: " + this.destino +
                "\nVAGAS : " + this.vagas() +
                "\nDATA DE VIAGEM: " + data +
        "\n===============================";
    }
}
