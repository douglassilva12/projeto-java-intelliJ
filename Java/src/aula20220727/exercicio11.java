package aula20220727;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        //O IMC – Indice de Massa Corporal é um critério da
        // Organização Mundial de Saúde para dar umaindicação
        // sobre a condição de peso de uma pessoa adulta.
        // A fórmula é IMC = peso / ( altura )^2.
        // Elabore um algoritmo que leia o peso e a altura de um adulto
        // e mostre sua condição de acordo com a tabela abaixo.
        // IMC em adultos Condição Abaixo de 18,5 Abaixo do peso
        // Entre 18,5 e 25 Peso normal
        // Entre 25 e 30 Acima do peso
        // Acima de 30 obeso
        Scanner teclado = new Scanner(System.in);
        double peso, altura, IMC;
        System.out.println("peso: ");
        peso = teclado.nextDouble();
        System.out.println("altura: ");
        altura = teclado.nextDouble();
        IMC = peso / Math.pow(altura, 2);
        if (IMC < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (IMC >= 18.5 && IMC <= 25) {
            System.out.println("Peso normal!");
        } else if (IMC > 25 && IMC <= 30) {
            System.out.println("Acima do peso!");
        } else {
            System.out.println("Obeso!");
        }
    }
}