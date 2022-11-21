package aula20220816;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia Nome idade e sexo de N pessoas. Após a leitura faça:
        a. Imprima o Nome, idade e sexo das pessoas cuja idade seja maior que a idade da primeira pessoa.
        b. Imprima o Nome e idade de todas as mulheres.
        c. Imprima o Nome dos homens menores de 21 anos.
        */

        Scanner teclado = new Scanner(System.in);
        int qtdpessoas;
        System.out.println("Quantos cadastros deseja fazer?");
        qtdpessoas = teclado.nextInt();
        String nome[]= new String[qtdpessoas];
        int idade[]= new int[qtdpessoas];
        String sexo[]= new String[qtdpessoas];
        for (int x = 0; x < qtdpessoas; x++) {
            System.out.println("Nome: ");
            nome[x] = teclado.next();
            System.out.println("Idade: ");
            idade[x] = teclado.nextInt();
            System.out.println("Sexo: ");
            sexo[x] = teclado.next();
        }
        //a. Imprima o Nome, idade e sexo das pessoas cuja idade seja maior que a idade da primeira pessoa.
        System.out.println("Lista de pessoas com idades maiores que a primeira pessoa.");
        for (int x = 0; x < qtdpessoas; x++) {
            if (idade[x] > idade[0]) {
                System.out.println("Nome: " + nome[x] + ". Idade: " + idade[x] + ". Sexo: " + sexo[x]);
            }
        }
        System.out.println("");
        //b. Imprima o Nome e idade de todas as mulheres.
        System.out.println("Lista de mulheres.");
        for (int x = 0; x < qtdpessoas; x++) {
            if (sexo[x].equalsIgnoreCase("f") || sexo[x].equalsIgnoreCase("feminino")) {
                System.out.println("Nome: " + nome[x] + ". Idade: " + idade[x]);
            }
        }
        System.out.println("");
        //c. Imprima o Nome dos homens menores de 21 anos.
        System.out.println("Lista de homens com menos de 21 anos.");
        for (int x = 0; x < qtdpessoas; x++) {
            if ((sexo[x].equalsIgnoreCase("m") ||
                    sexo[x].equalsIgnoreCase("masculino")) &&
                    (idade[x] < 21)) {
                System.out.println("Nome: " + nome[x]);
            }
        }
        System.out.println("");
        //d. não pertence a nenhum dos grupos
        System.out.println("Todos os cadastros.");
        for (int x = 0; x < qtdpessoas; x++) {
            System.out.println("Nome: " + nome[x] + ". Idade: " + idade[x] + ". Sexo: " + sexo[x]);
        }
    }
}