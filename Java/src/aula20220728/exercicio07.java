package aula20220728;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia um numero e apos
        //imprima o numero lido, o seu antecessor
        //e o seu sucessor na tela.
        Scanner teclado = new Scanner(System.in);
        int numero, antecessor, sucessor;
        System.out.println("Insira um numero: ");
        numero = teclado.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println("Numero: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}