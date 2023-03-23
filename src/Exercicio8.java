import java.util.Scanner;

//solicitar ao usuário 2 valores inteiros e imprimir na tela o resultado da divisão de um pelo outro com 2 casas decimais

public class Exercicio8 {

    public static void main(String [] args){

        Scanner input = new Scanner (System.in);



        System.out.println("Digite um numero inteiro: ");
        int numero1 = input.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int numero2 = input.nextInt();

        System.out.printf("Resultado da divisao com 2 casas decimais = %.2f %n", (numero1 + numero2)/2f);

        //solicitar ao usuário 2 valores inteiros e imprimir na tela o resultado da divisão de um pelo outro com 3 casas decimais

        System.out.println("Digite um numero inteiro: ");
        int numero3 = input.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int numero4 = input.nextInt();

        System.out.printf("Resultado da divisao com 3 casas decimais = %.3f %n", (numero3 + numero4)/2f);

        //solicitar ao usuário 2 valores inteiros e imprimir na tela o resultado da divisão de um pelo outro com 4 casas decimais

        System.out.println("Digite um numero inteiro: ");
        int numero5 = input.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int numero6 = input.nextInt();

        System.out.printf("Resultado da divisao com 4 casas decimais = %.4f %n", (numero3 + numero4)/2f);
    }
}
