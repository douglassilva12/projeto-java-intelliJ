package aula20220808;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        //Escrever um algoritmo que leia um número N que indica quantos valores
        //devem ser lidos a seguir. Para cada número lido, mostre os valores lidos
        //e o fatorial destes valores.
        Scanner teclado = new Scanner(System.in);
        int numero, y = 1;
        System.out.println("Escreva um numero");
        numero = teclado.nextInt();
        for (int x = 1; x <= numero; x++) {
            if (numero < 0) {
                System.out.println("Numero invalido");
            } else if (numero == 0) {
                y = 0;
            } else {
                y *= x;
            }
            System.out.println("Numero: " + x + ", fatorial:" + y);
        }
    }
}