package aula20220816;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Faça um algoritmo que determine qual o menor valor existente no vetor do Exercício 02.
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        for (int cont = 0; cont < numero.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " numero: ");
            numero[cont] = teclado.nextInt();
        }
        int menor = numero[0];
        for (int cont = 0; cont < numero.length; cont++) {
            if (numero[cont] < menor) {
                menor = numero[cont];
            }
        }
        System.out.println("Menor numero:" + menor);
    }
}