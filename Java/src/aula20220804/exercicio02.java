package aula20220804;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número e
        // escreva a sequência decrescente até zero.
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Numero:");
        numero = teclado.nextInt();
        System.out.println("");
        int cont = numero;
        while (cont >= 0) {
            System.out.println("While " + cont);
            cont--;
        }
        System.out.println("");
        for (cont = numero; cont >= 0; cont--) {
            System.out.println("For " + cont);
        }
    }
}