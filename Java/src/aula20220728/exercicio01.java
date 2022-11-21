package aula20220728;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia o nome e as tres notas
        // de um aluno e ao final,escreva o seu nome,
        // sua media e se ele foi aprovado.
        // Media de aprovacao igual a 8.
        Scanner teclado = new Scanner(System.in);
        String nome;
        double notaA, notaB, notaC, media;
        System.out.println("Nome: ");
        nome = teclado.next();
        System.out.println("Nota 1: ");
        notaA = teclado.nextDouble();
        System.out.println("Nota 2: ");
        notaB = teclado.nextDouble();
        System.out.println("Nota 3: ");
        notaC = teclado.nextDouble();
        media = (notaA + notaB + notaC) / 3;
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        if (media >= 8) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}