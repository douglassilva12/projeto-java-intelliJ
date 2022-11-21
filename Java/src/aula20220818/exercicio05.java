package aula20220818;

public class exercicio05 {
    public static void main(String[] args) {
        /*
        Dada uma matriz de ordem 3X3.
        Matriz A = [[1, 5,],[7, 3],[8, 2]]
        Faca um algoritmo que:
        a. Gere a Matriz B transposta de A.
        a. A Matriz gerada sera a matriz abaixo:
        Matriz B - Transposta = [[1, 7, 8],[5, 3, 2]]
         */
        int matrizA[][] = {{1, 5,}, {7, 3}, {8, 2}};
        int matrizB[][] = new int[2][3];
        for (int l = 0; l < matrizA.length;l++) {
            for (int c = 0; c < matrizA[l].length;c++) {
                matrizB[c][l]=matrizA[l][c];
            }
        }
        for (int l = 0; l < matrizB.length; l++) {
            for (int c = 0; c < matrizB[l].length; c++) {
                switch (c) {
                    case 0:
                        System.out.print(" " + matrizB[l][c]);
                        break;
                    case 1:
                        System.out.print(" " + matrizB[l][c]);
                        break;
                    case 2:
                        System.out.print(" " + matrizB[l][c]);
                        break;
                }
            }
            System.out.println();
        }
    }
}