package aula20220809;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 10 números do usuário
        // e calcule a soma desses números.
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        for (int x = 1; x <= 10; x++) {
            int numero;
            System.out.println("Digite o " + x + " numero:");
            numero = teclado.nextInt();
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }
}