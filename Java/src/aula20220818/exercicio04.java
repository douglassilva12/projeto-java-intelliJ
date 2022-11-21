package aula20220818;

import java.text.DecimalFormat;

public class exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        /*
        Dada uma matriz A 2x3 de valores reais(float ou Double)(salários).
        Matriz A = {{2500.98, 5573.45, 7980.32},{850.26, 987.23, 3536.24}}
        Faça um algoritmo que faca a leitura destes valores e imprima:
        a. Soma dos dados de cada coluna e linha.
        Ex: Soma coluna 01=> xxx
        Ex: Soma coluna 02=> xxx
        Ex: Soma coluna 03=> xxx
        Ex: Soma linha 01=> xxx
        Ex: Soma linha 02=> xxx
        b. listar valores menores que a media em um novo vetor(se necessario for).
        */

        double matriz[][] = {{2500.98, 5573.45, 7980.32}, {850.26, 987.23, 3536.24}};
        double linha1 = 0, linha2 = 0, coluna1 = 0, coluna2 = 0, coluna3 = 0;
        double soma = 0, media,menor=0;
        int tm = 0; //tamanho da matriz
        double vetor []= new double[6];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l < 1) {
                    switch (c) {
                        case 0:linha1 += matriz[l][c];break;
                        case 1:linha1 += matriz[l][c];break;
                        case 2:linha1 += matriz[l][c];break;
                    }
                    soma+=linha1;
                } else {
                    switch (c) {
                        case 0:linha2 += matriz[l][c];break;
                        case 1:linha2 += matriz[l][c];break;
                        case 2:linha2 += matriz[l][c];break;
                    }
                    soma+=linha2;
                }
                if (c < 1) {
                    switch (l) {
                        case 0:coluna1 += matriz[l][c];break;
                        case 1:coluna1 += matriz[l][c];break;
                        case 2:coluna1 += matriz[l][c];break;
                    }
                    soma+=coluna1;
                } else if (c < 2) {
                    switch (l) {
                        case 0:coluna2 += matriz[l][c];break;
                        case 1:coluna2 += matriz[l][c];break;
                        case 2:coluna2 += matriz[l][c];break;
                    }
                    soma+=coluna2;
                } else {
                    switch (l) {
                        case 0:coluna3 += matriz[l][c];break;
                        case 1:coluna3 += matriz[l][c];break;
                        case 2:coluna3 += matriz[l][c];break;
                    }
                    soma+=coluna3;
                }
                tm++;
            }
        }
        media=soma/tm;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if(matriz[l][c]<media){
                    vetor[tm]=matriz[l][c];
                }else{
                    vetor[tm]=0;
                }
            }
        }
        for (int c = 0; c < vetor.length; c++) {
            System.out.println("valor vetor"+vetor);
        }
    }
}