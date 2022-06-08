package br.com.exercicios.poo.classes.questao4;

import java.util.Scanner;

public class Prova {
    private char[] respostas = new char[15];
    private int sequencial;
    private Gabarito gabarito;
    private String nome;

    public Prova(Gabarito gabarito, String nome) {
        this.sequencial = 0;
        this.gabarito = gabarito;
        this.nome = nome;
    }

    public void respotaAluno(char reposta){
         respostas[this.sequencial++] = reposta;
    }

    public double nota() {
        double nota = 0;
        for(int i = 0; i < 15; i++){
            if(gabarito.respostaQuestao(i) == respostas[i]){
                if(i >= 0 && i <= 9){
                    nota += 0.5;
                }else {
                    nota += 1;
                }
            }
        }
        return nota;
    }

    public int acertos(){
        int acertos = 0;
        for(int i = 0; i < 15; i++){
            if(gabarito.respostaQuestao(i) == respostas[i]){
                acertos++;
            }
        }
        return acertos;
    }

    public double maiorNota(Prova prova){
        if(this.acertos() == prova.acertos()){
            if(this.nota() == prova.nota()){
                return prova.nota();
            }else {
                if(this.nota() > prova.nota()){
                    return this.nota();
                }else {
                    return prova.nota();
                }
            }
        }else {
            if(this.acertos() > prova.acertos()){
                return this.nota();
            }else {
                return prova.nota();
            }
        }
    }











}
