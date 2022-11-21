package Atividade01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio66 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0");

        double limite = 500;

        double pares = 0;
        double impares = 0;
        double divisores3 = 0;
        double somapares = 0;
        double fatorialImpares = 0;
        double perfeitos = 0;
        double imperfeitos = 0;

        for (int i = 1; i <= limite; i++) {

//        pares
            if (i % 2 == 0) {
                pares++;

//            impares
            } else {
                impares++;
            }
//            divisiveis 3
            if (i % 3 == 0) {
                divisores3++;
            }
//          soma dos numeros pares
            if (i % 2 == 0) {
                somapares+=i;
            }
//        quantidade de numero perfeitos
            double n = 0;
            double calculo = 0;

            for (n = 1; n < i; n++) {
                if (i % n == 0) {
                    calculo = calculo + n;
                }
            }
            if (calculo == i) {
                perfeitos++;
            } else {
                imperfeitos++;
            }
        }
        //            fatorial dos numeros impares
        double contador = 1;
        while (contador <= 500){
            double numero = contador;

            boolean impar = true;
            // verifica se o numero e impar para calcular o fatorial
            if(numero % 2 == 0){
                impar = false;
            }

            // quando nao for impar, prossegue para op proximo numero
            if(!impar){
                contador++;
                continue;
            }

            double y = 1;
            for (double x = 1; x <= numero; x++) {
                y *= x;
            }
            System.out.println("Fatorial do numero impar " + numero + " e: " + y);

            contador++;


        }
        System.out.println("o resultado é:");
        System.out.println(df.format(pares));
        System.out.println(df.format(impares));
        System.out.println(df.format(divisores3));
        System.out.println(df.format(somapares));
        System.out.println(df.format(perfeitos));
        System.out.println(df.format(imperfeitos));
    }
}