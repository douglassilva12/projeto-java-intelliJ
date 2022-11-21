package aula20220801;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Faça um algoritmo para verificar se um aluno esta APROVADO ou REPROVADO,
        // lendo 3 notas e calculando sua media que deve ser maior ou igual a 7.
        Scanner teclado = new Scanner(System.in);
        double a, b, c, media;
        System.out.println("nota 1: ");
        a = teclado.nextDouble();
        System.out.println("nota 2: ");
        b = teclado.nextDouble();
        System.out.println("nota 3: ");
        c = teclado.nextDouble();
        media = (a + b + c) / 3;
        if (media >= 7) {
            System.out.println("Media: " + media);
            System.out.println("Aprovado!");
        } else {
            System.out.println("Media: " + media);
            System.out.println("Reprovado!");
        }
    }
}