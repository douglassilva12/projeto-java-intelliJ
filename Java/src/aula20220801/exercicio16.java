package aula20220801;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        //Fornecido os coeficientes de uma equação do 2 grau,(a,b,c - ler do teclado)
        // * faça um algoritmo que calcule as raizes se houverem
        // * Validar se o numero e negativo, pois não existe raiz de numero negativo!
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double a, b, c, d = 0, x1 = 0, x2 = 0;
        System.out.println("Numero a: ");
        a = teclado.nextDouble();
        System.out.println("Numero b: ");
        b = teclado.nextDouble();
        System.out.println("Numero c: ");
        c = teclado.nextDouble();
        d = Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            d = d * (-1);
        }
        if(d==0){
            System.out.println("Não e possivel calcular!");
        }
        x1 = ((b * (-1)) + Math.sqrt(d)) / (2 * a);
        x2 = ((b * (-1)) - Math.sqrt(d)) / (2 * a);
        System.out.println("Valor 1: " + df.format(x1));
        System.out.println("Valor 2: " + df.format(x2));
    }
}