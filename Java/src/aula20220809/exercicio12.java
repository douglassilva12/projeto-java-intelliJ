package aula20220809;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números do
        // usuario e exiba quantos números são pares.
        Scanner teclado = new Scanner(System.in);
        int numero, par = 0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                par++;
            }
        }
        if (par <= 0) {
            System.out.println("Não tem nenhum numero par!");
        } else if (par == 1) {
            System.out.println("Tem 1 numero par!");
        } else {
            System.out.println("Tem " + par + " numeros pares!");
        }
    }
}