package aula20220809;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a soma das idades.
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        for (int x = 1; x <= 20; x++) {
            int idade;
            System.out.println("Digite a " + x + " idade:");
            idade = teclado.nextInt();
            soma += idade;
        }
        System.out.println("Soma: " + soma);
    }
}