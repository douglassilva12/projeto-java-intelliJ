package aula20220804;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número e
        // escreva a sequência de zero até o número.
        Scanner teclado = new Scanner(System.in);
        int numero, cont = 0;
        System.out.println("Numero: ");
        numero = teclado.nextInt();
        System.out.println("");
        while (cont <= numero) {
            System.out.println("While " + cont);
            cont++;
        }
        System.out.println("");
        for (cont = 0; cont <= numero; cont++) {
            System.out.println("For " + cont);
        }
    }
}