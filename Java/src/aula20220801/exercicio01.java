package aula20220801;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Conta telefônica - Uma conta telefônica é composta dos seguintes custos:
        // assinatura: R$ 17,90
        // impulsos: R$ 0,04 por impulso que exceder a 90 interurbanos
        // chamadas p/ celular: R$0,20 por impulso
        // Monte a fórmula para calcular o valor da conta para 254 impulsos,
        // R$34,29 de interurbanos e 23 chamadas para celular.
        // Elabore um programa que mostra os custos, calcula e mostra o valor total.
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double ass = 17.9, imp0, imp1 = 34.29, imp2 = 0.04, cha0, cha1 = 0.2, vt;
        imp0 = imp1 + ((254 - 90) * imp2);
        cha0 = 23 * cha1;
        vt = ass + imp0 + cha0;
        System.out.println("Valor total assinatura: " + df.format(ass));
        System.out.println("Valor total interurbanos: " + df.format(imp0));
        System.out.println("Valor total chamada p/ celular: " + df.format(cha0));
        System.out.println("Valor total conta: " + vt);
    }
}