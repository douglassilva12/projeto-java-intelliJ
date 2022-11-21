package Atividade01;

import java.util.Scanner;

public class exercicio59 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cand, total = 0;
        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Votos candidato " + cont + ": ");
            cand = teclado.nextInt();
            if (cand > 200) {
                total++;
            }
        }
        System.out.println(total + " candidato(s) tiveram mais de 200 votos");
    }
}