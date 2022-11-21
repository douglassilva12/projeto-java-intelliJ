package aula20220727;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        //Faça um algoritmo que leia dois valores inteiros A e B,
        //e se os valores forem iguais deverá se somar os dois,
        //caso contrário multiplique A por B.
        //Ao final de qualquer um dos cálculos deve-se atribuir
        //o resultado para uma variável C e mostrar seu conteúdo na tela.

        Scanner teclado = new Scanner(System.in);
        int a, b, c = 0;

        System.out.println("Informe o valor de A:");
        a = teclado.nextInt();

        System.out.println("Informe o valor de B:");
        b = teclado.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O valor de C e:" + c);
    }
}