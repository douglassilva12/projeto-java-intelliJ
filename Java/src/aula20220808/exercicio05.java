package aula20220808;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //País 1: 5 milhões de habitantes, taxa de natalidade de 4% e mortalidade de 1,1%.
        //País 2: 7 milhoes de habitantes, taxa de natalidade de 2% e mortalidade de 0,8%.
        // Em quanto tempo o paás 1 ira ultrapassar o país 2?
        // Quantos milhoes de população tera o país 1 e o país 2 quando isso ocorrer?
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double p1 = 5000000, tn1 = 0.04, tm1 = 0.011;
        double p2 = 7000000, tn2 = 0.02, tm2 = 0.008;
        double resultado = 0;
        while (p1 < p2) {
            p1 = p1 + (p1 * tn1) - (p1 * tm1);
            p2 = p2 + (p2 * tn2) - (p2 * tm2);
            resultado++;
        }
        System.out.println("Resultado: " + resultado);
        System.out.println("Populacao: " + df.format(p1));
        System.out.println("Populacao: " + df.format(p2));
    }
}