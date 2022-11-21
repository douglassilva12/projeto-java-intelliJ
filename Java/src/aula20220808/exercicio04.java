package aula20220808;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Dada uma série de 5 valores, faca um algoritmo que calcule e escreva a média destes.
        //Entretanto, se a média obtida for maior que 8, devera ser atribuido 10 para a média.
        Scanner teclado = new Scanner(System.in);
        double nota, soma=0, media;
        for(int x=1;x<=5;x++){
            System.out.println("Informe a nota "+x+":");
            nota= teclado.nextDouble();
            soma+=nota;
        }
        media=soma/5;
        if (media > 8) {
            media = 10;
        }
        System.out.println("Media: " + media);
    }
}