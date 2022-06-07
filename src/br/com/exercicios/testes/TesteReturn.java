package br.com.exercicios.testes;

public class TesteReturn {
    public static void main(String[] args) {

        int i = 1;

        boolean retorno = retornar(i);

        System.out.println(retorno);


    }

    private static boolean retornar(int i) {
        switch (i){
            case 1:
                System.out.println("Passa por aqui");
                return true;
                //não passa por aqui, return finaliza
            case 2:
                return false;

        }
        System.out.println("Passa por aqui?");
        return false;

    }
}


