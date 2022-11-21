package Atividade01;

import java.util.Scanner;

public class exercicio57 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, abaixo = 0;
        for (int cont = 1; cont <= 20; cont++) {
            System.out.println("nota " + cont + ":");
            nota = teclado.nextInt();
            if (nota < 5) {
                abaixo++;
            }
        }
        System.out.println("Tem " + abaixo + " nota(s) abaixo de 5");
    }
}