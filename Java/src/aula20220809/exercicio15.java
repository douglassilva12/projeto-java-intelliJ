package aula20220809;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia uma sequência de
        // números do usuario e realize a soma desses números.
        // Encerre a execução quando um número negativo for digitado.
        Scanner teclado = new Scanner(System.in);
        int numero, soma = 0, contador = 0, controle = 1;
        while (contador < controle) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero < 0) {
                contador = controle;
            } else {
                soma += numero;
                contador++;
                controle++;
            }
        }
        System.out.println("Resultado da soma: " + soma);
    }
}