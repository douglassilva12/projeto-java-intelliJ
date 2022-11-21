package aula20220801;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        //Desenvolva um algoritmo para identificar se um determinado
        // numero inteiro, * é positivo,negativo,ou nulo.
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Numero: ");
        n = teclado.nextInt();
        if (n < 0) {
            System.out.println("negativa");
        } else if (n == 0) {
            System.out.println("nulo");
        } else {
            System.out.println("positivo");
        }
    }
}