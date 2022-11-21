package aula20220808;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //Escreva um algoritmo que mostre o menor e o maior
        //dos números digitados pelo usuario.
        //Termine a leitura se o usuario digitar zero.
        Scanner teclado = new Scanner(System.in);
        int numero, menor = 0, maior = 0, contador = 0, controle = 1;
        while (contador < controle) {
            System.out.println("Digite o " + controle + " numero");
            numero = teclado.nextInt();
            if (numero == 0) {
                break;
            }
            if (menor == 0) {
                menor = numero;
            }
            if (maior == 0) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            controle++;
            contador++;
        }
        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);
    }
}