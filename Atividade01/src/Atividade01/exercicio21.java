package Atividade01;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia = 0.8, dia = 5, semana = 45, total = 0;
        total = (dia * semana) * distancia;
        System.out.println(total + " km");
    }
}