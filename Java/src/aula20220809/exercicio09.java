package aula20220809;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        //Leia o nome e a idade de 10 pessoas
        // e exiba o nome da pessoa mais nova.
        Scanner teclado = new Scanner(System.in);
        int menor = 0;
        String menorNome = "";
        for (int x = 1; x <= 3; x++) {
            String nome;
            int idade;
            System.out.println("Nome:");
            nome = teclado.next();
            System.out.println("Idade:");
            idade = teclado.nextInt();
            if (menor == 0) {
                menor = idade;
            }
            if (menorNome.equals("")) {
                menorNome = nome;
            }
            if (idade < menor) {
                menor = idade;
                menorNome = nome;
            }
        }
        System.out.println(menorNome);
        System.out.println(menor);
    }
}