package aula20220816;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia, via teclado,
        10 valores do tipo inteiro e os guarde na memória.
        Após a leitura liste os números armazenados.
        */
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        for (int cont = 0; cont < numero.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " numero: ");
            numero[cont] = teclado.nextInt();
        }
        for (int cont = 0; cont < numero.length; cont++) {
            System.out.println((cont + 1) + " numero: " + numero[cont]);
        }
    }
}