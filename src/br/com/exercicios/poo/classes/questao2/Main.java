package br.com.exercicios.poo.classes.questao2;

public class Main {
    public static void main(String[] args) {

        Data data = new Data(1, 1, 1988);
        Data data1 = new Data(1, 1, 1988);
        Data data2 = new Data(3, 2, 1992);

        Data data3 = new Data(1, 3, 2000);
        Data data4 = new Data(3, 4, 2000);

        Data data5 = new Data(10, 5, 3000);
        Data data6 = new Data(3, 5, 3000);

        //Configuração padrão para datas invalidas

//        Data data7 = new Data(3, 5, 0); //ano invalido
//        System.out.println(data7.getData());
//        Data data8 = new Data(34, 0, 1); // dia e mês invalidos
//        System.out.println(data8.getData());
//        Data data9 = new Data(30, 2, 3000); // dia invalido de por conta do mês
//        System.out.println(data9.getData());
//        Data data10 = new Data(30, 13, 3000); // mês invalido
//        System.out.println(data10.getData());

        //TESTE método clone
        Data data1clone = data1.clone();
        System.out.println("Data 1 Original: " + data1.getData());
        System.out.println("Data 1 Clone: " + data1clone.getData());

        //TESTE Data com hora

        data1.setData(2, 30, 0);
        System.out.println("Data com hora: " + data1.getData());

        //Comparando
//        System.out.println(data.compara(data1));
//        System.out.println(data.compara(data2));
//        System.out.println(data2.compara(data));
//
//        System.out.println("\n\n");
//        System.out.println(data3.compara(data4));
//        System.out.println(data4.compara(data3));
//
//        System.out.println("\n\n");
//        System.out.println(data5.compara(data6));
//        System.out.println(data6.compara(data5));





    }
}
