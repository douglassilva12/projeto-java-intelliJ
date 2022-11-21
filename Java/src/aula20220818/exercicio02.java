package aula20220818;

public class exercicio02 {
    public static void main(String[] args) {
        /*
        Dadas duas matrizes A e B de ordem 3 X 3.
        Matriz A =[[2, 59, 617],[8, 5, 95],[1, 59, 67]]
        Matriz B =[[22, 559, 678],[13, 59 , 7],[27, 159, 627]]
        Faca um algoritmo que some as duas e gere a matriz C que é a Soma dos respectivos elementos de A e B.
        Imprima os valores das tres matrizes.
         */

        int a[][] = {{2, 59, 617}, {8, 5, 95}, {1, 59, 67}};
        int b[][] = {{22, 559, 678}, {13, 59, 7}, {27, 159, 627}};
        int c[][] = new int[3][3];
        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; coluna++) {
                c[linha][coluna] = a[linha][coluna] + b[linha][coluna];
            }
        }
        System.out.println("Matriz A");
        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; ) {
                System.out.println(a[linha][coluna++] + ", " + a[linha][coluna++] + ", " + a[linha][coluna++]);
            }
        }
        System.out.println("\nMatriz B");
        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; ) {
                System.out.println(b[linha][coluna++] + ", " + b[linha][coluna++] + ", " + b[linha][coluna++]);
            }
        }
        System.out.println("\nMatriz C");
        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; ) {
                System.out.println(c[linha][coluna++] + ", " + c[linha][coluna++] + ", " + c[linha][coluna++]);
            }
        }
    }
}