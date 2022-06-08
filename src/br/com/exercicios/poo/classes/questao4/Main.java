package br.com.exercicios.poo.classes.questao4;

public class Main {
    public static void main(String[] args) {

        Gabarito gabarito = new Gabarito("Matematica", "Bruna Arquino");

//        TESTE: Completar o gabarito
//        gabarito.completarGabarito();
//        System.out.println(gabarito);
//        System.out.println(gabarito.respostaQuestao(5));

        Prova prova1 = new Prova(gabarito, "Ana Vitoria");
        prova1.respotaAluno('A');
        prova1.respotaAluno('B');
        prova1.respotaAluno('A');
        prova1.respotaAluno('C');
        prova1.respotaAluno('D');
        prova1.respotaAluno('E');
        prova1.respotaAluno('A');
        prova1.respotaAluno('B');
        prova1.respotaAluno('B');
        prova1.respotaAluno('E');
        prova1.respotaAluno('A');
        prova1.respotaAluno('E');
        prova1.respotaAluno('D');
        prova1.respotaAluno('C');
        prova1.respotaAluno('B');

        Prova prova2 = new Prova(gabarito, "Pedro Henrique");
        prova2.respotaAluno('A');
        prova2.respotaAluno('B');
        prova2.respotaAluno('A');
        prova2.respotaAluno('C');
        prova2.respotaAluno('C');
        prova2.respotaAluno('E');
        prova2.respotaAluno('A');
        prova2.respotaAluno('B');
        prova2.respotaAluno('B');
        prova2.respotaAluno('A');
        prova2.respotaAluno('C');
        prova2.respotaAluno('B');
        prova2.respotaAluno('A');
        prova2.respotaAluno('A');
        prova2.respotaAluno('E');

        Prova prova3 = new Prova(gabarito, "Joãoziho Umdoistres");
        prova3.respotaAluno('B');
        prova3.respotaAluno('C');
        prova3.respotaAluno('D');
        prova3.respotaAluno('A');
        prova3.respotaAluno('B');
        prova3.respotaAluno('C');
        prova3.respotaAluno('D');
        prova3.respotaAluno('B');
        prova3.respotaAluno('B');
        prova3.respotaAluno('E');
        prova3.respotaAluno('A');
        prova3.respotaAluno('E');
        prova3.respotaAluno('D');
        prova3.respotaAluno('C');
        prova3.respotaAluno('B');

        System.out.println("Prova 1 -> " + prova1.acertos() + " Acertos e tirou nota " + prova1.nota());
        System.out.println("Prova 2 -> " + prova2.acertos() + " Acertos e tirou nota " + prova2.nota());
        System.out.println("Prova 3 -> " + prova3.acertos() + " Acertos e tirou nota " + prova3.nota());

        //Testes de comparação
        System.out.println("\n=================================");
        System.out.println("Maior nota entre as provas 1 e 2");
        System.out.println("1 comparando com 2: " + prova1.maiorNota(prova2));
        System.out.println("2 comparando 1: " + prova2.maiorNota(prova1));

        System.out.println("\n=================================");
        System.out.println("Maior nota entre as provas 1 e 3");
        System.out.println("1 comparando com 3: " + prova1.maiorNota(prova3));
        System.out.println("3 comparando 1: " + prova3.maiorNota(prova1));

        System.out.println("\n=================================");
        System.out.println("Maior nota entre as provas 2 e 3");
        System.out.println("2 comparando com 3: " + prova2.maiorNota(prova3));
        System.out.println("3 comparando 2: " + prova3.maiorNota(prova2));





    }
}
