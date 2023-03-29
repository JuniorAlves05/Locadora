package locadora;

import java.util.Scanner;

public class Locadora {

    public static void main ( String [] args){

        Scanner sc = new Scanner(System.in);
        String name;
        int idade;

        Filme f1 = new Filme("Tarzan"," O rei da floresta ",10);
        Filme f2 = new Filme(" Mundo Bita","Viva no mundo Bita",1);
        Filme f3 = new Filme(" Xvideos","Filme Adulto",18);
        Filme f4 = new Filme(" Redtube"," Filme Adulto",18);


        System.out.println(" Informe seu nome : ");
        name = sc.next();
        System.out.println(" Informe sua idade:");
        idade = sc.nextInt();
        System.out.println(" Seja bem vindo " + name );
        System.out.println();
        System.out.println(" Iremos disponibilizar o catalogo de acordo com sua idade :) ");
        System.out.println();
        if(idade < 18){
            System.out.println(f1);
            System.out.println();
            System.out.println(f2);
        }else if (idade >= 18){
            System.out.println(f1);
            System.out.println();
            System.out.println(f2);
            System.out.println(f3);
            System.out.println();
            System.out.println(f4);
        }


    }

}
