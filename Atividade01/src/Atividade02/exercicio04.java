package Atividade02;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        // Faça um algoritmo que leia dois valores inteiros A e B,
        // e se os valores forem iguais deverá se somar os dois,
        // caso contrário multiplique A por B. Ao final de qualquer um dos
        // cálculos deve-se atribuir o resultado
        // para uma variável C e mostrar seu conteúdo na tela.
        Scanner teclado = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Informe valor 1:");
        a = teclado.nextInt();
        System.out.println("Informe valor 2:");
        b = teclado.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O valor resulta em: " + c);
    }
}