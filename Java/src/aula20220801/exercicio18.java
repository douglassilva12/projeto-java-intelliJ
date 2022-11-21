package aula20220801;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba do usuario o
        // raio em cm e calcule o volume de uma esfera.
        // Formula: VOLUME = 4 * PI * R ao cubo.
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double raio, volume;
        System.out.println("Raio: ");
        raio = teclado.nextDouble();
        volume = 4 * 3.14159265359 * Math.pow(raio, 3);
        System.out.println("Valor volume: " + df.format(volume));
    }
}