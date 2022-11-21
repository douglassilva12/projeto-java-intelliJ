package aula20220815;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia 10 salários, armazene num vetor (double)
        //e depois percorra esse vetor identificando qual o indice do maior salário.
        Scanner teclado = new Scanner(System.in);
        int salario[] = new int[10];
        double maior = 0;
        int indice = 0;
        for (int cont = 0; cont < salario.length; cont++) {
            System.out.println("Escreva salario " + (cont + 1) + ": ");
            salario[cont] = teclado.nextInt();
        }
        for (int cont = 0; cont < salario.length; cont++) {
            if (salario[cont] > maior) {
                maior = salario[cont];
                indice = cont;
            }
        }
        System.out.println("Maior salario: " + maior + ". Indice: " + indice);
    }
}