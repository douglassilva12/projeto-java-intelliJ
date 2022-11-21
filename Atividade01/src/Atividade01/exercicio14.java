package Atividade01;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        // Faca um algoritmo que leia o menor numero de tres digitados.
        Scanner teclado = new Scanner(System.in);

        double a, b, c = 1;

        System.out.println("Informe um valor para a:");
        a = teclado.nextDouble();

        System.out.println("Informe um valor para b:");
        b = teclado.nextDouble();

        System.out.println("Informe um valor para c:");
        c = teclado.nextDouble();

        // teste
        // a=3, b=5, c=2.
        // menor numero digitado = 2
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("O menor numero e: " + c);

                }
            }
        }

        // teste
        // a=2, b=6, c=4.
        // menor numero digitado = 2
        if (a < b) {
            if (a < c) {
                System.out.println("O menor numero e: " + a);

            }
        }

        // teste
        // a=3, b=2, c=8.
        // menor numero digitado = 2
        if (a > b) {
            if (a < c) {
                System.out.println("O menor numero e: " + b);
            }
        }

    }
}