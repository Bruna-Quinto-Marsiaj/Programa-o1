import java.util.Scanner;


import java.util.Scanner;

public class Exercicio7{

    public static void main(String [] args){

        Scanner input = new Scanner (System.in);
        String nome;

        System.out.println("Seu nome? ");
        nome = input.nextLine();

        System.out.println("Sua idade? ");
        int idade = input.nextInt();

        System.out.println("Seu peso? ");
        double peso = input.nextDouble();



        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);

    }
}