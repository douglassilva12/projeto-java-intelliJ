package Atividade01;

import java.util.Scanner;

public class exercicio65 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, razao;
        System.out.println("Numero: ");
        numero = teclado.nextInt();
        System.out.println("Razao: ");
        razao = teclado.nextInt();
        System.out.println("\nnumero 1: "+numero);
        for (int cont = 1; cont <= 9; cont++) {
            numero+=razao;
            System.out.println("numero "+cont+": "+numero);
        }
    }
}
