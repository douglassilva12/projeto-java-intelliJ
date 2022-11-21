package aula20220728;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia o menor numero de tres digitados.
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe primeiro numero: ");
        a = teclado.nextInt();
        System.out.println("Informe segundo numero: ");
        b = teclado.nextInt();
        System.out.println("Informe terceiro numero: ");
        c = teclado.nextInt();
        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        } else if (b < a && b < c) {
            System.out.println("Menor: " + b);
        } else if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }
    }
}