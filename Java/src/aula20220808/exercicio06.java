package aula20220808;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        //Implemente um algoritmo que leia um número e uma opção de listagem.
        //Com base nessa opção, escreva a sequência dos números:
        //em ordem crescente (de zero até o número)
        //ou decrescente (do número até zero).
        //Exemplo:
        //Opcao=> 1 - CRESCENTE
        //Opcao=> 2 - DECRESCENTE
        Scanner teclado = new Scanner(System.in);
        int numero, cont, escolha;
        System.out.println("Digite o numero");
        numero = teclado.nextInt();
        System.out.println("Opcao 1: crescente");
        System.out.println("Opcao 2: crescente");
        System.out.println("Ordem para mostrar");
        escolha = teclado.nextInt();
        if (escolha == 1) {
            cont = 0;
            while (cont <= numero) {
                System.out.println(cont);
                cont++;
            }
        } else if (escolha == 2) {
            cont = numero;
            while (cont >= 0) {
                System.out.println(cont);
                cont--;
            }
        } else {
            System.out.println("Opcao invalida!");
        }
    }
}