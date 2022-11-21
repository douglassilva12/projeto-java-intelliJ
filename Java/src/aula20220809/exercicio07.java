package aula20220809;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a média das idades.
        Scanner teclado = new Scanner(System.in);
        int soma = 0, media = 0;
        for (int x = 1; x <= 20; x++) {
            int idade;
            System.out.println("Digite a " + x + " idade:");
            idade = teclado.nextInt();
            soma += idade;
            media = soma / 20;
        }
        System.out.println("Soma: " + media);
    }
}