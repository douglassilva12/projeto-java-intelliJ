package aula20220801;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        //Suponha que voce foi ao supermercado e comprou:
        // n Kg de café á x reais;
        // k litros de leite á y reais;
        // m Kg de farinha a z reais;
        // Faça um algoritmo que imprima o ticket de compra.
        // Primeiro produto: R$ 0,00 Segundo // : R$ 0.00
        Scanner teclado = new Scanner(System.in);
        String p1, p2, p3, p4, p5;
        double q1, q2, q3, q4, q5;
        double pr1, pr2, pr3, pr4, pr5, total;
        System.out.println("produto 1: ");
        p1 = teclado.next();
        System.out.println("preco: ");
        pr1 = teclado.nextDouble();
        System.out.println("quantidade: ");
        q1 = teclado.nextDouble();
        System.out.println("produto 2: ");
        p2 = teclado.next();
        System.out.println("preco: ");
        pr2 = teclado.nextDouble();
        System.out.println("quantidade: ");
        q2 = teclado.nextDouble();
        System.out.println("produto 3: ");
        p3 = teclado.next();
        System.out.println("preco: ");
        pr3 = teclado.nextDouble();
        System.out.println("quantidade: ");
        q3 = teclado.nextDouble();
        System.out.println("produto 4: ");
        p4 = teclado.next();
        System.out.println("preco: ");
        pr4 = teclado.nextDouble();
        System.out.println("quantidade: ");
        q4 = teclado.nextDouble();
        System.out.println("produto 5: ");
        p5 = teclado.next();
        System.out.println("preco: ");
        pr5 = teclado.nextDouble();
        System.out.println("quantidade: ");
        q5 = teclado.nextDouble();
        total = ((pr1 * q1) + (pr2 * q2) + (pr3 * q3) + (pr4 * q4) + (pr5 * q5));
        System.out.println(p1 + ": " + pr1);
        System.out.println(p2 + ": " + pr2);
        System.out.println(p3 + ": " + pr3);
        System.out.println(p4 + ": " + pr4);
        System.out.println(p5 + ": " + pr5);
        System.out.println(p5 + ": " + pr5);
    }
}