package Atividade02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = 3000, cv = 500, qtdcv = 0, vv, vtv = 0, pvt = 0.05, ts = 0;
        System.out.println("Quantos carros foram vendidos?");
        qtdcv = teclado.nextDouble();
        if (qtdcv > 0) {
            for (int cont = 1; cont <= qtdcv; cont++) {
                System.out.println("Valor do carro " + cont + ":");
                vv = teclado.nextDouble();
                vtv += vv;

            }
            ts = salario + (qtdcv * cv) + (vtv * pvt);
            System.out.println("Salario total: R$ " + df.format(ts));
        } else {
            System.out.println("nenhum carro vendido!");
        }
    }
}