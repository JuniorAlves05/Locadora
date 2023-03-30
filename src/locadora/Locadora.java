package locadora;
import java.util.Locale;
import java.util.Scanner;

public class Locadora {

    public static void main ( String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        int idade;
        int escolha;
        double total = 0;
        boolean continuar = true;
        String filme = " Filme nao selecionado ";



        Filme f1 = new Filme(001,"Tarzan"," O rei da floresta ",10,10.00);
        Filme f2 = new Filme(002," Mundo Bita","Viva no mundo Bita",1,5.00);
        Filme f3 = new Filme(003," Xvideos","Filme Adulto",18,15.00);
        Filme f4 = new Filme(004," Redtube"," Filme Adulto",18,15.00);

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
        System.out.println();

        while (continuar) {
            System.out.println();
            System.out.println(" Escolha um filme para alugar (digite 0 para finalizar):");
            escolha = sc.nextInt();
            if (escolha == 0) {
                continuar = false;
            } else if (escolha == 1) {
                total += 10.0;
            } else if (escolha == 2) {
                total += 5.0;
            } else if (escolha == 3) {
                if (idade >= 18) {
                    total += 15.0;
                } else {
                    System.out.println("Voce nao tem idade suficiente para alugar este filme.");
                }
            } else if (escolha == 4) {
                if (idade >= 18) {
                    total += 15.0;
                } else {
                    System.out.println("Voce nao tem idade suficiente para alugar este filme.");
                }
            } else {
                System.out.println("Escolha inválida.");
            }
        }

        System.out.println();
        System.out.println("           Usuario : " + name);
        System.out.println();
        System.out.printf(" Total dos filmes alugados R$: %.2f ", total );
        System.out.println();
        System.out.println();
        System.out.println("           Volte Sempre !!! ");

    }

}




