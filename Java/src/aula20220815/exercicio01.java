package aula20220815;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Desenvolva um programa que leia 10 nomes, armazene num vetor (de Strings)
        // e depois percorra esse vetor escrevendo os nomes presentes nele.
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[10];
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println("Escreva o nome " + (cont + 1) + ": ");
            nome[cont] = teclado.next();
        }
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println("Nome " + (cont + 1) + ": " + nome[cont]);
        }
    }
}