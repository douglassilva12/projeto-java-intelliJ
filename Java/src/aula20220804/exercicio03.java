package aula20220804;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2
        // através de somas repetidas.(Exemplo:2 e 3 = 2 + 2 + 2 => 6)
        Scanner teclado = new Scanner(System.in);

        int num1, num2, soma = 0;

        System.out.println("Numero 1:");
        num1 = teclado.nextInt();
        System.out.println("Numero 2:");
        num2 = teclado.nextInt();
        for (int cont = 1; cont <= num2; cont++) {
            soma += num1;
        }
        System.out.println(soma);
    }
}