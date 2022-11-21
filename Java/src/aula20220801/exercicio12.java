package aula20220801;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois numeros inteiros (n1 e n2)
        // * calcule a divisão de n1/n2, e informe o resto desta divisão.
        // * Não pode ser usado funções pré-programadas
        // (mod em VisualG e % em JAVA).
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        double n4, n5, n6;
        System.out.println("Numero 1: ");
        n1 = teclado.nextInt();
        System.out.println("Numero 2: ");
        n2 = teclado.nextInt();
        n3 = n1 / n2;
        n4 = n1;
        n5 = n2;
        n6 = (n4 / n5) - n3;
        System.out.println("resultado2: " + n6);
    }
}