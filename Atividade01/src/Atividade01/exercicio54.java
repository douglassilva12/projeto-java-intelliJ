package Atividade01;

import java.util.Scanner;

public class exercicio54 {
    public static void main(String[] args) {

        // Leia 7 valores referente ao valor gasto com o
        // almoço de cada dia durante uma semana.
        // Em seguida, informe o total em dinheiro gasto na semana.
        Scanner teclado = new Scanner(System.in);

        int valorgasto, total = 0;
        // String valorgasto;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Valor gasto em cada almoco:");
            valorgasto = teclado.nextInt();
            total += valorgasto;

        }

        System.out.println("O total é: " + total);

    }
}
