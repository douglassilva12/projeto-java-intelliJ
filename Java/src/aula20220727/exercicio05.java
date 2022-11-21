package aula20220727;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Encontrar o dobro de um número caso ele seja positivo
        //e o seu triplo caso seja negativo, imprimindo o resultado.

        Scanner teclado = new Scanner(System.in);
        double numero, resultado = 0;
        System.out.println("Informe o numero: ");
        numero = teclado.nextInt();
        if (numero > 0) {
            resultado = numero * 2;
        } else if (numero < 0) {
            resultado = numero * 3;
        }
        System.out.println("O resultado e: " + resultado);
    }
}