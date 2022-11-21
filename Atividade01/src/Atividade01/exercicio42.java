package Atividade01;

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("informe um numero");
        double numero= teclado.nextDouble();

        if(numero%4==0){
            System.out.println("numero multiplo de 4");
        }else{
            System.out.println("numero nao é multiplo de 4");
        }
    }
}
