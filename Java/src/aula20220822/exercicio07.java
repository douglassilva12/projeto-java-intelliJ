package aula20220822;

public class exercicio07 {
    public static void main(String[] args) {
        int matriz[][]=new int[7][21];
        int cont=0;
        for(int l=0;l< matriz.length;l++){
            for(int c=0;c< matriz.length;c++){
                cont++;
                if(cont%2!=0&&cont<=300){
                    matriz[l][c]=cont;
                }
            }
        }
        for(int l=0;l< matriz.length;l++){
            for(int c=0;c< matriz.length;c++){
                System.out.println(matriz[l][c]);
            }
        }
    }
}