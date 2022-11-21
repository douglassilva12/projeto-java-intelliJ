package aula20220801;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        //Calcule o salario do mes de um funcionario.
        // * O funcionario ganha 3000,
        // mais 500 reais por carro vendido,
        // * mais 5% do valor total de cada carro vendido.
        // * Quanto o funcionario ganha ao fim do mes?

        Scanner teclado = new Scanner(System.in);
        //cv = valor por carro vendido
        //pcv = porcentagem carro vendido
        //vtv =  valor total de todos os carros vendidos
        //ts = total salario
        //qcv = quantidade de carros vendidos
        double salario = 3000, cv = 500, pcv = 0.05, vtv, ts, qcv;
        System.out.println("Quantidade carros vendidos: ");
        qcv = teclado.nextDouble();
        System.out.println("Valor total das vendas: ");
        vtv = teclado.nextDouble();
        ts = salario + (qcv * cv) + (vtv * pcv);
        System.out.println("Total salario: " + ts);
    }
}