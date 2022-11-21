package Atividade02;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fim;
        int numero, controle = 1;
        for (int cont = 0; cont < controle; cont++) {
            System.out.println("Digite o numero:");
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Numero par!");
            } else {
                System.out.println("Numero impar!");
            }
            controle++;
            System.out.println("Terminou de verificar? (sim/nao)");
            fim = teclado.next();
            if (fim.equalsIgnoreCase("sim")) {
                break;
            }
        }
    }
}