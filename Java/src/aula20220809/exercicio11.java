package aula20220809;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números do usuario
        // e exiba quantos números são maiores que 8.
        Scanner teclado = new Scanner(System.in);
        int numero, maior = 0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero > 8) {
                maior++;
            }
        }
        if (maior <= 0) {
            System.out.println("Não tem nenhum numero maior que 8!");
        } else if (maior == 1) {
            System.out.println("Tem 1 numero maior que 8!");
        } else {
            System.out.println("Tem " + maior + " numeros maiores que 8!");
        }
    }
}