package br.com.exercicios.poo.classes.questao4;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Scanner;

public class Gabarito {

    private char[] respostas = new char[15];
    private String materia;
    private String professor;

    public Gabarito(String materia, String professor) {
        this.materia = materia;
        this.professor = professor;
        //Gabarito fixo para teste
        respostas[0] = 'A';
        respostas[1] = 'B';
        respostas[2] = 'A';
        respostas[3] = 'C';
        respostas[4] = 'D';
        respostas[5] = 'E';
        respostas[6] = 'A';
        respostas[7] = 'B';
        respostas[8] = 'B';
        respostas[9] = 'E';
        respostas[10] = 'A';
        respostas[11] = 'E';
        respostas[12] = 'D';
        respostas[13] = 'C';
        respostas[14] = 'B';
    }

    public void completarGabarito() {
        Scanner scan = new Scanner(System.in);
        for (int i=1; i <= 15; i++){
            char resposta;
            do{
                System.out.println("Digite a resposta da questão " + i );
                String resStr = scan.next();
                resStr = resStr.toUpperCase();
                if(verificarResposta(resStr)){
                    resposta = resStr.charAt(0);
                }else {
                    System.out.println("Resposta Invalida!");
                    resposta = ' ';
                }
            }while (resposta == ' ');

            System.out.println("Adicionando resposta...");
            adicionarResposta(i, resposta);
        }
    }

    private void adicionarResposta(int numQuestao,char resposta) {
        respostas[--numQuestao] = resposta;
    }

    public char respostaQuestao(int numQuestao) {
        return respostas[numQuestao];
    }

    public boolean verificarResposta(String resposta){
        switch (resposta){
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                return true;
            default:
                return false;
        }
    }

    public String gabarito(){
        String gabarito = ">> GABARITO ======";
        int i = 1;
        for (char resposta: respostas) {
            gabarito += "\nQuestão " + i + ": " + resposta;
            i++;
        }
        gabarito += "\n===============";
        return gabarito;
    }

    public char[] getRespostas() {
        return respostas;
    }

    public String getMateria() {
        return materia;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "MATERIA: " + materia +
                "\nPROFESSOR: " + professor +
                "\n" + gabarito();
    }
}
