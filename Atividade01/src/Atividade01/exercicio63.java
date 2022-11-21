package Atividade01;

import java.util.Scanner;

public class exercicio63 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int total = 0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Nome do aluno " + x + ":");
            nome= teclado.next();
            if (nome.equalsIgnoreCase("maria")) {
                total++;
            }
        }
        System.out.println(total + " aluna(s) que se chama(m) Maria");
    }
}
