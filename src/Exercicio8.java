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

        
    }
}
