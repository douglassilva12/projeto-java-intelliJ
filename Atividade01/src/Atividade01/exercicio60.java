package Atividade01;

import java.util.Scanner;

public class exercicio60 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, total = 0;
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Nota do aluno " + cont + ":");
            nota = teclado.nextInt();
            if (nota >= 5 && nota <= 7) {
                total++;
            }
        }
        System.out.println(total + " aluno(s) tem nota entre 5 e 7");
    }
}