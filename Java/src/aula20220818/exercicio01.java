package aula20220818;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        // Faca uma matriz A de ordem 9 x 3 que:
        // leia nome, idade e sexo de nove pessoas.
        // Imprima os valores da matriz gerada.

        Scanner teclado = new Scanner(System.in);
        String nome, sexo;
        int idade;
        String dados[][] = new String[9][3];
        for (int l = 0; l < 9; l++) {
            for (int c = 0; c < 3; c++) {
                switch (c) {
                    case 0:
                        System.out.println("Nome: ");
                        nome = teclado.next();
                        dados[l][c] = nome;
                        break;
                    case 1:
                        System.out.println("Idade: ");
                        idade = teclado.nextInt();
                        dados[l][c] = Integer.toString(idade);
                        break;
                    case 2:
                        System.out.println("Sexo: ");
                        sexo = teclado.next();
                        dados[l][c] = sexo;
                        break;
                }
            }
        }
        for (int l = 0; l < dados.length; l++) {
            for (int c = 0; c < dados[l].length; c++) {
                switch (c) {
                    case 0:
                        System.out.print(" Nome: " + dados[l][c]);
                        break;
                    case 1:
                        System.out.print(" Idade: " + dados[l][c]);
                        break;
                    case 2:
                        System.out.print(" Sexo: " + dados[l][c]);
                        break;
                }
            }
            System.out.println();
        }
    }
}