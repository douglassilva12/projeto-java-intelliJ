package aula20220808;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Suponha que para cada aluno de uma sala exista uma ficha
        // contendo o nome e a idade de 05 alunos. Faça algoritmo
        // que determine quantos alunos tem idade maior que 30.
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade, qtdIdade = 0, cont = 0;
        while (cont <= 5) {
            System.out.println("Nome: ");
            nome = teclado.next();
            System.out.println("Idade: ");
            idade = teclado.nextInt();
            if (idade > 30) {
                qtdIdade++;
            }
            cont++;
        }
        System.out.println("Pessoas com mais de 30 anos: " + qtdIdade);
    }
}