package aula20220808;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número e calcule
        // seu fatorial. Ex: 5! = 5 * 4 * 3 * 2 * 1.
        Scanner teclado = new Scanner(System.in);
        int numero, y = 1;
        System.out.println("Digite um numero");
        numero = teclado.nextInt();
        for (int x = 1; x <= numero; x++) {
            if (numero < 0) {
                System.out.println("Numero invalido");
            } else if (numero == 0) {
                y = 0;
            } else {
                y *= x;
            }
        }
        System.out.println("Fatorial de " + numero + " e: " + y);
    }
}