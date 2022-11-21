package Atividade02;

import java.util.Scanner;

public class exercicio60 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double quantidadenumero = 200;

        for (int i = 0; i < quantidadenumero; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}