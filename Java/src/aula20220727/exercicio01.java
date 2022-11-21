package aula20220727;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia os valores A, B, C
        //e imprima na tela se a soma de A + B é menor que C.
        Scanner teclado = new Scanner(System.in);

        int A, B, C = 0;
        int soma = 0;

        // 1) Faça um algoritmo que leia os valores A, B, C
        // e imprima na tela se a soma de A + B é menor que C.
        System.out.println("Informe o valor de A: ");
        A = teclado.nextInt();

        System.out.println("Informe o valor de B: ");
        B = teclado.nextInt();

        System.out.println("Informe o valor de C: ");
        C = teclado.nextInt();
        // teste 1 = 15 15 35 -> "A soma de A + B é menor que C."
        // teste 1 = 15 15 25 -> "A soma de A + B não é menor que C."
        soma = A + B;

        if (soma < C) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B não é menor que C.");
        }
    }
}