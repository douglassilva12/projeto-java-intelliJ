package aula20220815;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*Capture do teclado valores para o preenchimento de uma matriz
        M 3x3. Após a captura imprima a matriz criada e encontre a
        quantidade de números pares e a quantidade de números ímpares.*/

        Scanner teclado = new Scanner(System.in);
        int numero[][] = new int[3][3];
        int par = 0, impar = 0;
        for (int linha = 0; linha < numero.length; linha++) {
            for (int coluna = 0; coluna < numero[linha].length; coluna++) {
                System.out.println("Escreva numero: ");
                numero[linha][coluna] = teclado.nextInt();
                if (numero[linha][coluna] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        for (int linha = 0; linha < numero.length; linha++) {
            for (int coluna = 0; coluna < numero[linha].length; coluna++) {
                System.out.println("numeros: " + numero[linha][coluna]);
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
    }
}