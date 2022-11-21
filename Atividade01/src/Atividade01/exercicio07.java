package Atividade01;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        // Faça um algoritmo que leia uma variável e some 5 caso seja
        // par ou some 8 caso seja ímpar,
        // imprimir o resultado desta operação.
        Scanner teclado = new Scanner(System.in);

        // Teste
        // 4 = par, entao resultado = 9.
        // 5 = impar, entao resultado = 13

        int numero = 0;

        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O valor e: " + (numero + 5));
        } else {
            System.out.println("O valor e: " + (numero + 8));

        }

    }
}