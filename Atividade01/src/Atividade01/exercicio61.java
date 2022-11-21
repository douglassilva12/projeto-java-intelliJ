package Atividade01;

import java.util.Scanner;

public class exercicio61 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int total = 0;
        for (int x = 1; x <= 10; x++) {
            System.out.println("Nome do aluno " + x + ":");
            nome= teclado.next();
            if (nome.equalsIgnoreCase("joao")) {
                total++;
            }
        }
        System.out.println(total + " aluno(s) que se chama(m) Joao");
    }
}
