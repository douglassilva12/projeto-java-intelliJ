package Atividade01;

import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        double numero=5000;
        double numerosperfeitos=0;

        double n=0;
        for(int i=0;i<numero;i++){

            double calculo=0;
            for(n=1;n<i;n++) {
                if (i % n == 0) {
                    calculo = calculo + n;
                }
            }
            if(calculo==i){
                System.out.println("perfeito:"+calculo);
                numerosperfeitos++;
            }

        }
        System.out.println(numerosperfeitos);
    }
}

