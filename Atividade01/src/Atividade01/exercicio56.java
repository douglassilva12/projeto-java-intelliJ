package Atividade01;

import java.util.Scanner;

public class exercicio56 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, acima = 0;
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("nota " + cont + ":");
            nota = teclado.nextInt();
            if (nota > 7) {
                acima++;
            }
        }
        System.out.println("Tem " + acima + " nota(s) acima de 7");
    }
}