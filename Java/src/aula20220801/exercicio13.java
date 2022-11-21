package aula20220801;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        //Faça um algoritmo para ler uma temperatura em graus Celsius, e transforme
        // * para graus Farenheidt e Kelvin. * OBS: * C = 5 (F - 32)/9; * K = C + 273;
        Scanner teclado = new Scanner(System.in);
        double c, f, k;
        System.out.println("Temperatura: ");
        c = teclado.nextDouble();
        f = (9 / 5) * (c + 32);
        k = c + 273;
        System.out.println("Grau Farenheidt: " + f);
        System.out.println("Grau Kelvin: " + k);
    }
}