package Atividade01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        double raio,pi=3.14159265359,volume,volume2;
        System.out.println("Informe o raio:");
        raio= teclado.nextDouble();
        volume=4*pi*raio;
        if(volume<1000){
            System.out.println("Volume: "+df.format(volume)+" cm3");
        }else{
            volume2=volume/100;
            System.out.println("Volume: "+df.format(volume2)+" m3");
        }
    }
}
