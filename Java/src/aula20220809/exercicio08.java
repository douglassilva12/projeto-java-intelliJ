package aula20220809;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        for (int x = 1; x <= 20; x++) {
            int idade;
            System.out.println("Digite a " + x + " idade:");
            idade = teclado.nextInt();
            if (idade == 18 || idade > 18) {
                maior++;
            }
        }
        System.out.println("Soma: " + maior);
    }
}