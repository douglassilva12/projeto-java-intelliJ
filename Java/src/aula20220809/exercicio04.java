package aula20220809;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Leia um número N e um nome de um usuario.
        // Escreva o nome deste usuario na tela N vezes (numero digitado inicialmente).
        Scanner teclado = new Scanner(System.in);
        String nome;
        int repeticao;
        System.out.println("Digite o nome");
        nome = teclado.next();
        System.out.println("Quantas repeticoes do nome?");
        repeticao = teclado.nextInt();
        for (int x = 1; x <= repeticao; x++) {
            System.out.println("Nome:" + nome);
        }
    }
}