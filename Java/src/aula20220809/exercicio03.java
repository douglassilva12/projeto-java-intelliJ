package aula20220809;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome");
        nome = teclado.next();
        for (int x = 1; x <= 10; x++) {
            System.out.println("Nome:" + nome);
        }
    }
}