package aula20220809;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //Crie um algoritmo leia um número do usuario
        // e exiba a sua tabuada de multiplicação.
        Scanner teclado = new Scanner(System.in);
        int numero, multip;
        System.out.println("Digite o numero:");
        numero = teclado.nextInt();
        for (int x = 0; x <= numero; x++) {
            multip = numero * x;
            System.out.println(numero + " * " + x + " = " + multip);
        }
    }
}