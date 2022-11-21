package Atividade02;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        // O IMC – Indice de Massa Corporal é um critério da Organização
        // Mundial de Saúde para dar uma indicação sobre a condição de
        // peso de uma pessoa adulta. A fórmula é IMC = peso /
        // ( altura )2 Elabore um algoritmo que leia o peso e a altura
        // de um adulto e mostre sua condição de acordo com a tabela
        // abaixo. IMC em adultos Condição Abaixo de 18,5 Abaixo do peso
        // Entre 18,5 e 25 Peso normal Entre 25 e 30 Acima do peso Acima
        // de 30 obeso
        Scanner teclado = new Scanner(System.in);

        double altura;
        double peso;
        double IMC = 0;

        System.out.println("Informe sua altura: ");
        altura = teclado.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = teclado.nextDouble();

        IMC = peso / Math.pow(altura, 2);

        if (peso < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (peso < 25) {
            System.out.println("Peso normal");
        } else if (peso < 30) {
            System.out.println("Acima do peso");
        } else if (peso > 30) {
            System.out.println("Obeso");
        }
    }
}