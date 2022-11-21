package aula20220808;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        // Crie um algoritmo que receba vários números inteiros e positivos
        // e imprima o produto dos números ímpares digitados e a soma dos pares.
        // O algoritmo encerra quando o zero ou um número negativo é digitado.
        Scanner teclado = new Scanner(System.in);

        int somapar = 0;
        int produtoimpar = 1;
        int contador = 0;
        int controle = 1;

        while (contador < controle) {
            System.out.println("Passando aqui... contador na posicao: " + contador);
            System.out.println("Informe o numero: ");
            int numeroControle = teclado.nextInt();
            if (numeroControle % 2 == 0) {
                somapar = somapar + numeroControle;
                System.out.println("Soma na posicao:" + contador + " =>" + somapar);
            } else {
                produtoimpar = produtoimpar * numeroControle;
                System.out.println("Produto na posicao:" + contador + " =>" + produtoimpar);
            }
            controle++;
            if ((numeroControle == 0) || (numeroControle < 0)) {
                contador = controle;
            }
            contador++;
        }
        System.out.println("Soma dos numeros pares:" + somapar);
        System.out.println("Produto dos numeros impares:" + produtoimpar);
    }
}