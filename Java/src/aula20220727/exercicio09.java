package aula20220727;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia três valores inteiros e diferentes
        // e mostre-os em ordem crescente.
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe primeiro numero: ");
        a = teclado.nextInt();
        System.out.println("Informe segundo numero: ");
        b = teclado.nextInt();
        System.out.println("Informe terceiro numero: ");
        c = teclado.nextInt();
        if (a < b) {
            if (a < c) {
                if (b < c) {
                    System.out.println("A: " + a + ", B: " + b + ", C: " + c);
                } else {
                    System.out.println("A: " + a + ", C: " + c + ", B: " + b);
                }
            }
        }
        if (b < a) {
            if (b < c) {
                if (a < c) {
                    System.out.println("B: " + b + ", A: " + a + ", C: " + c);
                } else {
                    System.out.println("B: " + b + ", C: " + c + ", A: " + a);
                }
            }
        }
        if (c < a) {
            if (c < b) {
                if (a < b) {
                    System.out.println("C: " + c + ", A: " + a + ", B: " + b);
                } else {
                    System.out.println("C: " + c + ", B: " + b + ", A: " + a);
                }
            }
        }
    }
}