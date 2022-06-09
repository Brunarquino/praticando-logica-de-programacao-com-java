package br.com.exercicios.poo.herança.questao2;

public class Equipamento {

    private int[] valor;
    private int numeroEquipamentos;

    public Equipamento(int numeroEquipamentos) {
        this.valor = new int[numeroEquipamentos];
        this.numeroEquipamentos = numeroEquipamentos;
    }

    public int getNumeroEquipamentos() {
        return numeroEquipamentos;
    }

    public int getValor(int numero) {
        return valor[numero];
    }

    public void setValor(int numero ,int valor) {
        this.valor[numero] = valor;
    }



}
