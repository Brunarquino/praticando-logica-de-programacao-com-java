package br.com.exercicios.poo.classes.questao1;

public class Main {
    public static void main(String[] args) {


        //Objetos Alunos
        Aluno aluno1 = new Aluno("Bruna", 1, 10, 10, 10 );
        verificarQtFalta(aluno1.getNome(), aluno1.provaFinal());

        //Objetos Alunos
        Aluno aluno2 = new Aluno("Ana", 2, 5, 8, 10 );
        verificarQtFalta(aluno2.getNome(), aluno2.provaFinal());


    }

    public static void verificarQtFalta(String nome, double provaFinal){
        if(provaFinal == 0 ){
            System.out.println("Aluno(a)" + nome + " não precisa fazer nota final ");
        }else {
            System.out.println("Aluno(a)" + nome + " precisa de " + provaFinal + " na Prova Final ");
        }
    }


}
