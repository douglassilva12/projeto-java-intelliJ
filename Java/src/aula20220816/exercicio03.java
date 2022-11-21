package aula20220816;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Amplie o exercício anterior emitindo um relatório com todos os números pares que você leu.
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        for (int cont = 0; cont < numero.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " numero: ");
            numero[cont] = teclado.nextInt();
        }
        for (int cont = 0; cont < numero.length; cont++) {
            if(numero[cont]%2==0){
                System.out.println((cont + 1) + " numero par: " + numero[cont]);
            }
        }
    }
}