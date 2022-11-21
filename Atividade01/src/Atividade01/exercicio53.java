package Atividade01;

import java.util.Scanner;

public class exercicio53{
        public static void main(String[] args) {
        // Crie um algoritmo para o usuário tentar adivinhar
        // qual é o seu nome. Ele terá até 10 chances para acertar.
        Scanner teclado = new Scanner(System.in);

        String nome = "Joao";
        int tentativas = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Tente adivinhar o nome:");

            String nomelido = teclado.next();

            if (nomelido.equalsIgnoreCase(nome)) {
                System.out.println("Voce acertou!!");

                break;
            } else {
                tentativas++;

                if (tentativas == 10) {
                    System.out.println("Voce atingiu o numero maximo de tentativas :(");
                    break;
                }
            }

        }

    }

}