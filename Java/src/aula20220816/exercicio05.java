package aula20220816;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Faça um algoritmo que determine qual o maior valor existente no vetor do Exercício 02.
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        int maior = numero[0];
        for (int cont = 0; cont < numero.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " numero: ");
            numero[cont] = teclado.nextInt();
        }
        for (int cont = 0; cont < numero.length; cont++) {
            if (numero[cont] > maior) {
                maior = numero[cont];
            }
        }
        System.out.println("Maior numero:" + maior);
    }
}