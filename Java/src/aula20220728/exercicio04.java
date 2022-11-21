package aula20220728;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia o maior numero de tres digitados.
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe primeiro numero: ");
        a = teclado.nextInt();
        System.out.println("Informe segundo numero: ");
        b = teclado.nextInt();
        System.out.println("Informe terceiro numero: ");
        c = teclado.nextInt();
        if (a > b && a > c) {
            System.out.println("Maior: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maior: " + b);
        } else if (c > a && c > b) {
            System.out.println("Maior: " + c);
        }
    }
}