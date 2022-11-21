package aula20220809;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 20 números e, ao
        // final, escreva quantos estão entre 0 e 100.
        Scanner teclado = new Scanner(System.in);
        int numero, entre = 0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero >= 0 && numero <= 100) {
                entre++;
            }
        }
        if (entre <= 0) {
            System.out.println("Não tem nenhum numero entre 0 e 100!");
        } else if (entre == 1) {
            System.out.println("Tem 1 numero entre 0 e 100!");
        } else {
            System.out.println("Tem " + entre + " numeros entre 0 e 100!");
        }
    }
}