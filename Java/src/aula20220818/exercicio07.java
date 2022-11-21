package aula20220818;

public class exercicio07 {
    public static void main(String[] args) {
        int matrizA[][]={{2, 5, 11},{5, 4, 17},{11, 17, 6}};
        int matrizB[][]=new int[3][3];
        int comp=0;
        for (int l = 0; l < matrizA.length;l++) {
            for (int c = 0; c < matrizA[l].length;c++) {
                matrizB[l][c]=matrizA[l][c]*(-1);
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