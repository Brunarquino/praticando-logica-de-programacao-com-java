package br.com.exercicios.poo.classes.questao1;
/*

Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho.
Métodos da classe:
 - media:
        calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
 - final:
        calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

*/

public class Aluno {

    //Atributos dos Alunos
    private String nome;
    private int matricula;
    private double[] notaProvas = new double[2];
    private double notaTrabalho;

    //Métodos
    public double media(){
        double media = ( (this.notaProvas[0] * 2.5) + (this.notaProvas[1] * 2.5) + (this.notaTrabalho * 2) ) / 7;
        return media;
    }

    public  double provaFinal(){
        double media = media();
        System.out.println(media);

        double qtFalta = 10 - media;

        if(qtFalta <= 0 ){
            qtFalta = 0;
        }

        return qtFalta;

    }

    //Construtor
    public Aluno(String nome, int matricula, double n1, double n2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaProvas[0] = n1;
        this.notaProvas[1] = n2;
        this.notaTrabalho = notaTrabalho;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotaProvas() {
        return notaProvas;
    }
    public void setNotaProvas(double[] notaProvas) {
        this.notaProvas = notaProvas;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }
    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
