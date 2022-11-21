package aula20220801;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        //Determine a velocidade de um automovel que
        // percorreu uma distância S em km, * em um
        // intervalo de tempo T, informando em horas.
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double distancia, tempo, tempoH, tempoM, tempoS, velocidade;
        System.out.println("Distancia percorrida: ");
        distancia = teclado.nextInt();
        System.out.println("Tempo decorrido (horas): ");
        tempoH = teclado.nextInt();
        System.out.println("Tempo decorrido (minutos): ");
        tempoM = teclado.nextInt();
        System.out.println("Tempo decorrido (segundos): ");
        tempoS = teclado.nextInt();
        tempo = tempoH + (tempoM / 60) + (tempoS / 60);
        velocidade = distancia / tempo;
        System.out.println("Velocidade: " + df.format(velocidade) + " km/h");
    }
}