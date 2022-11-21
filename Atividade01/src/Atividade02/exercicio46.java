package Atividade02;

import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual país colonizou o Brasil?(ignorando letras maiusculas");
        String resposta = teclado.next();

        if (resposta.equalsIgnoreCase("portugal")) {
            System.out.println("Você acertou! Parabéns!");
        } else {
            System.out.println("Você errou. Que pena");
        }
    }
}