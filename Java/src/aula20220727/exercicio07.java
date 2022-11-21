package aula20220727;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia uma variável e some 5 caso seja par
        // ou some 8 caso seja ímpar, imprimir o resultado desta operação.
        Scanner teclado = new Scanner(System.in);
        double numero = 0, resultado;
        System.out.println("Informe o numero: ");
        numero = teclado.nextDouble();
        if (numero % 2 == 0) {
            resultado = numero + 5;
        } else {
            resultado = numero + 8;
        }
        System.out.println("Resultado: " + resultado);
    }
}