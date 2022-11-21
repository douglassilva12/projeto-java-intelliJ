package aula20220816;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia 10 nomes e os guarde
        na memória. No fim, imprima os 10 nomes armazenados.
        */
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[10];
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " nome: ");
            nome[cont] = teclado.next();
        }
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println((cont + 1) + " nome: " + nome[cont]);
        }
    }
}