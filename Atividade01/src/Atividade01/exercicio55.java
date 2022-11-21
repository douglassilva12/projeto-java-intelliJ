package Atividade01;

import java.util.Scanner;

public class exercicio55 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int total1 = 0,total2=0,total3=0;
        for (int x = 1; x <= 20; x++) {
            System.out.println("Nome do aluno " + x + ":");
            nome= teclado.next();
            if (nome.equalsIgnoreCase("joao")) {
                total1++;
            }
            if (nome.equalsIgnoreCase("maria")) {
                total2++;
            }
        }
        total3=total1+total2;
        System.out.println("\n"+total1 + " aluno(s) que se chama(m) Joao");
        System.out.println(total2 + " aluna(s) que se chama(m) Maria");
        System.out.println(total3 + " aluno(s) que se chama(m) Joao ou Maria");
    }
}
