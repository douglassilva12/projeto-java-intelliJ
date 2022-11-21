package Atividade01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio62 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double gasto, total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Gasto do dia " + i + ":");
            gasto = teclado.nextDouble();
            total += gasto;
        }
        System.out.println("Total: " + df.format(total));
    }
}