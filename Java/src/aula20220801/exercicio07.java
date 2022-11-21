package aula20220801;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        //Faça um algoritmo para verificar se um valor e PAR ou IMPAR;
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println("Informe numero: ");
        numero = teclado.nextDouble();
        if (numero % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Impar!");
        }
    }
}