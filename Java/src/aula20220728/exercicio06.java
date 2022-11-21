package aula20220728;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia o maior, o menor
        //e o intermediario de tres numeros digitados.
        Scanner teclado = new Scanner(System.in);
        int a, b, c, menor = 0, meio = 0, maior = 0;
        System.out.println("Informe primeiro numero: ");
        a = teclado.nextInt();
        System.out.println("Informe segundo numero: ");
        b = teclado.nextInt();
        System.out.println("Informe terceiro numero: ");
        c = teclado.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    menor = c;
                    meio = b;
                    maior = a;
                } else {
                    menor = b;
                    meio = c;
                    maior = a;
                }
            }
        }
        if (b > a) {
            if (b > c) {
                if (a > c) {
                    menor = c;
                    meio = a;
                    maior = b;
                } else {
                    menor = a;
                    meio = c;
                    maior = b;
                }
            }
        }
        if (c > a) {
            if (c > b) {
                if (a > b) {
                    menor = b;
                    meio = a;
                    maior = c;
                } else {
                    menor = a;
                    meio = b;
                    maior = c;
                }
            }
        }
        System.out.println("Menor:" + menor);
        System.out.println("Meio:" + meio);
        System.out.println("Maior:" + maior);
    }
}