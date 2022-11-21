package Atividade01;

import java.util.Scanner;

public class exercicio49 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe um numero");
        double numero = teclado.nextDouble();

        if (numero < 50) {
            System.out.println("o numero é menor que 50");
        } else {
            System.out.println("numero maior que 50");
        }
    }
}