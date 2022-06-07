package br.com.exercicios.testes;

public class Slips {
    // O método string split() quebra uma determinada string em torno das correspondências da expressão regular fornecida.
    public static void main(String[] args)
    {

        System.out.println("TESTES DE SLIPS");
        System.out.println("---------TESTE 01-----------");
        String str = "geek@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String a : arrOfStr)
            System.out.println(a);

        System.out.println("---------TESTE 02-----------");
        String str1 = "geek.for.geekss";
        String[] arrOfStr1 = str1.split("\\.");

        for (String a : arrOfStr1)
            System.out.println(a);

        System.out.println("---------TESTE 03-----------");
        String str2 = "geek for geekss";
        String[] arrOfStr2 = str2.split(" ", 3);

        for (String a : arrOfStr2)
            System.out.println(a);

        System.out.println("---------TESTE 0-----------");
        String str3 = "geek-for- -geekss";
        String[] arrOfStr3 = str3.split("-", 3);

        for (String a : arrOfStr3)
            System.out.println(a);

        System.out.println("---------TESTE 04-----------");
        String str4 = "geek@for@geekss";
        String[] arrOfStr4 = str4.split("@");

        for (String a : arrOfStr4)
            System.out.println(a);



    }
}
