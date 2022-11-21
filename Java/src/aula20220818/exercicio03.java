package aula20220818;

public class exercicio03 {
    public static void main(String[] args) {
        /*
        Dado uma matriz A de ordem 3x3.
        Matriz A = {{2, 5, 7},{8, 9, 3},{1, 6, 10}}
        Faca um algoritmo que:
        a. Calcule a soma dos elementos da primeira coluna
        b. calcule o produto dos elementos da primeira linha
        c. Calcule a soma da diagonal principal
        */

        int matriz[][] = {{2, 5, 7}, {8, 9, 3}, {1, 6, 10}};
        int coluna = 0, linha = 0, diagonal = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                //a. Calcule a soma dos elementos da primeira coluna
                if (c < 1) {
                    switch (l) {
                        case 0:
                            coluna += matriz[l][c];
                            break;
                        case 1:
                            coluna += matriz[l][c];
                            break;
                        case 2:
                            coluna += matriz[l][c];
                            break;
                    }
                }
                //b. calcule o produto dos elementos da primeira linha
                if (l < 1) {
                    switch (c) {
                        case 0:
                            linha += matriz[l][c];
                            break;
                        case 1:
                            linha *= matriz[l][c];
                            break;
                        case 2:
                            linha *= matriz[l][c];
                            break;
                    }
                }
                //c. Calcule a soma da diagonal principal
                if (c == l) {
                    diagonal += matriz[l][c];
                }
            }
        }
        System.out.println("Coluna: " + coluna);
        System.out.println("Linha: " + linha);
        System.out.println("Diagonal: " + diagonal);
    }
}