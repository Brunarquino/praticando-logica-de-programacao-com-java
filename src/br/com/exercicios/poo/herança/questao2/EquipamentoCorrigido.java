package br.com.exercicios.poo.herança.questao2;

public class EquipamentoCorrigido extends Equipamento{

    private int mesCorrente;

    public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
        super(numeroEquipamentos);
        this.mesCorrente = mesCorrente;
    }

    public int getMesCompra(int numetoEquipamneto) {
        return mesCorrente;
    }

    public void setMesCompra(int mesCorrente) {
        this.mesCorrente = mesCorrente;
    }

    public void corrige(){

    }
}
