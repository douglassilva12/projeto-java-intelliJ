package Atividade02;

import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaSemana, controle = 1;
        for (int cont = 0; cont < controle; cont++) {
            System.out.println("Digite o dia da semana em numero");
            diaSemana = teclado.nextInt();
            if (diaSemana == 1) {
                System.out.println("Domingo\n");
            } else if (diaSemana == 2) {
                System.out.println("Segunda-feira\n");
            } else if (diaSemana == 3) {
                System.out.println("Terça-feira\n");
            } else if (diaSemana == 4) {
                System.out.println("Quarta-feira\n");
            } else if (diaSemana == 5) {
                System.out.println("Quinta-feira\n");
            } else if (diaSemana == 6) {
                System.out.println("Sexta-feira\n");
            } else if (diaSemana == 7) {
                System.out.println("Sabado\n");
            } else {
                cont = controle;
            }
            controle++;
        }
    }
}