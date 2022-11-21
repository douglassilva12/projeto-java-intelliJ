package Atividade01;

import java.util.Scanner;

public class exercicio64 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double livro, total = 0;
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Valor livro " + cont + ": ");
            livro = teclado.nextDouble();
            if (livro > 50) {
                total++;
            }
        }
        System.out.println(total + " livro(s) custa(m) mais de R$ 50,00");
    }
}