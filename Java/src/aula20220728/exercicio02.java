package aula20220728;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia tres numeros digitados,
        // e os coloque em ordem crescente.
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