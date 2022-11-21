package aula20220816;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia Nome e notas (total de 4 notas) de 5 alunos de um colégio.
        Após a leitura faça:
        a. Imprima o Nome e a média dos alunos aprovados (Média >= 7.0).
        b. Imprima o Nome e a média dos alunos em Recuperação (5.0 >= Média menor que 7.0)
        c. Imprima o Nome e a média dos alunos reprovados (Média menor que 5.0).
        d. Imprima o percentual de alunos aprovados.
        e. Imprima o percentual de alunos reprovados.
        */
        Scanner teclado = new Scanner(System.in);
        int qtda = 3; //quantidade alunos;
        int aprovado = 0, recuperacao = 0, reprovado = 0;
        double pa = 0, prec = 0, prep = 0;
        String nome[] = new String[qtda];
        double nota1[] = new double[qtda], nota2[] = new double[qtda],
                nota3[] = new double[qtda], nota4[] = new double[qtda],
                media[] = new double[qtda];
        for (int cont = 0; cont < qtda; cont++) {
            System.out.println("Nome do aluno " + (cont + 1) + ": ");
            nome[cont] = teclado.next();
            System.out.println("Nota 1 do aluno: ");
            nota1[cont] = teclado.nextDouble();
            System.out.println("Nota 2 do aluno: ");
            nota2[cont] = teclado.nextDouble();
            System.out.println("Nota 3 do aluno: ");
            nota3[cont] = teclado.nextDouble();
            System.out.println("Nota 4 do aluno: ");
            nota4[cont] = teclado.nextDouble();
            media[cont] = (nota1[cont] + nota2[cont] + nota3[cont] + nota4[cont]) / 4;
        }
        System.out.println("");
        //a. Imprima o Nome e a média dos alunos aprovados (Média >= 7.0).
        System.out.println("Nome e media dos alunos aprovados.");
        for (int cont = 0; cont < qtda; cont++) {
            if (media[cont] >= 7) {
                System.out.println("Nome: " + nome[cont] + ". Media:" + media[cont]);
                aprovado++;
            }
        }
        System.out.println("");
        //b. Imprima o Nome e a média dos alunos em Recuperação (5.0 >= Média menor que 7.0)
        System.out.println("Nome e media dos alunos em recuperacao.");
        for (int cont = 0; cont < qtda; cont++) {
            if (media[cont] >= 5 && media[cont] < 7) {
                System.out.println("Nome: " + nome[cont] + ". Media:" + media[cont]);
                recuperacao++;
            }
        }
        System.out.println("");
        //c. Imprima o Nome e a média dos alunos reprovados (Média menor que 5.0).
        System.out.println("Nome e media dos alunos reprovados.");
        for (int cont = 0; cont < qtda; cont++) {
            if (media[cont] < 5) {
                System.out.println("Nome: " + nome[cont] + ". Media:" + media[cont]);
                reprovado++;
            }
        }
        System.out.println("");
        //d. Imprima o percentual de alunos aprovados.
        System.out.println("Alunos aprovados: " + (pa = (100 / qtda) * aprovado) + "%.");
        //extra. Imprima o percentual de alunos em recuperacao.
        System.out.println("Alunos em recuperacao: " + (prec = (100 / qtda) * recuperacao) + "%.");
        //e. Imprima o percentual de alunos reprovados.
        System.out.println("Alunos aprovados: " + (prep = (100 / qtda) * reprovado) + "%.");
    }
}