package Atividade01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0");
        double velocidade, distancia, horas, minutos;
        System.out.println("Distancia percorrida:");
        distancia = teclado.nextDouble();
        System.out.println("Duracao em horas:");
        horas = teclado.nextDouble();
        System.out.println("Duracao em minutos:");
        minutos = teclado.nextDouble();
        velocidade = distancia / (horas + (minutos / 60));
        System.out.println(df.format(velocidade)+" km/h");
    }
}