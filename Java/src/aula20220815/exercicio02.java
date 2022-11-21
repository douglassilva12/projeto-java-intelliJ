package aula20220815;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia 10 salários, armazene num vetor (double)
        // e depois percorra esse vetor identificando qual o indice do maior salário.
        Scanner teclado = new Scanner(System.in);
        int idade[] = new int[10];
        double media = 0, soma = 0, total = 0;
        for (int cont = 0; cont < idade.length; cont++) {
            System.out.println("Escreva a idade " + (cont + 1) + ": ");
            idade[cont] = teclado.nextInt();
        }
        for (int cont = 0; cont < idade.length; cont++) {
            System.out.println("Idade " + (cont + 1) + ": " + idade[cont]);
            media = (soma += idade[cont]) / idade.length;
        }
        System.out.println("Media das idades: " + media);
    }
}