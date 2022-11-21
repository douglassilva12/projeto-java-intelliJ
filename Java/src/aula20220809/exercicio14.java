package aula20220809;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 20 números e, ao final, escreva
        // quantos estão entre 0 e 100,
        // quantos estão entre 101 e 200
        // e quantos são maiores que 200.
        Scanner teclado = new Scanner(System.in);
        int numero, entre1 = 0, entre2 = 0, entre3 = 0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero >= 0 && numero <= 100) {
                entre1++;
            }
            if (numero >= 101 && numero <= 200) {
                entre2++;
            }
            if (numero > 200) {
                entre3++;
            }
        }
        if (entre1 <= 0) {
            System.out.println("Não tem nenhum numero entre 0 e 100!");
        } else if (entre1 == 1) {
            System.out.println("Tem 1 numero entre 0 e 100!");
        } else {
            System.out.println("Tem " + entre1 + " numeros entre 0 e 100!");
        }
        if (entre2 <= 0) {
            System.out.println("Não tem nenhum numero entre 101 e 200!");
        } else if (entre2 == 1) {
            System.out.println("Tem 1 numero entre 101 e 200!");
        } else {
            System.out.println("Tem " + entre2 + " numeros entre 101 e 200!");
        }
        if (entre3 <= 0) {
            System.out.println("Não tem nenhum numero maior que 200!");
        } else if (entre3 == 1) {
            System.out.println("Tem 1 numero maior que 200!");
        } else {
            System.out.println("Tem " + entre3 + " numeros maiores que 200!");
        }
    }
}