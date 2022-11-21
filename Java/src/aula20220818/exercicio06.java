package aula20220818;

public class exercicio06 {
    public static void main(String[] args) {
        /*
        Dada uma matriz de ordem 3X3.
        Matriz A = [[2, 5, 11],[5, 4, 17],[11, 17, 6]]
        Faca um algoritmo que verifique se esta Matriz é simetrica.
        Para isso sabemos que a Matriz é simetrica quando: Matriz A = Matriz A(Transposta).
        Desse modo temos de gerar a Matriz transposta de A e ver se Aij = Aji.
         */
        int matrizA[][]={{2, 5, 11},{5, 4, 17},{11, 17, 6}};
        int matrizB[][]=new int[3][3];
        int comp=0;
        for (int l = 0; l < matrizA.length;l++) {
            for (int c = 0; c < matrizA[l].length;c++) {
                matrizB[c][l]=matrizA[l][c];
            }
        }
        for (int l = 0; l < matrizA.length;l++) {
            for (int c = 0; c < matrizA[l].length;c++) {
                if(matrizA[l][c]==matrizB[l][c]){
                    comp=1;
                }else{
                    comp=0;
                }
            }
        }
        if(comp==1){
            System.out.println("E matriz transposta");
        }else{
            System.out.println("Nao e matriz transposta");
        }
    }
}