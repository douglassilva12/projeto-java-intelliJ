package aula20220727;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Faça um algoritmo para receber um número qualquer
        //e informar na tela se é par ou ímpar.
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Informe o numero:");
        numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        int resultado = numero / 2;

        int resto = numero - (resultado * 2);

        System.out.println("Resultado:" + resultado);

        System.out.println("Resto:" + resto);
    }
}