package Atividade02;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        // int sucessor = +1;
        // int antecessor = -1;

        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();

        System.out.println("Numero lido: " + numero);
        System.out.println("Numero antecessor: " + (numero - 1));
        System.out.println("Numero sucessor: " + (numero + 1));
    }
}