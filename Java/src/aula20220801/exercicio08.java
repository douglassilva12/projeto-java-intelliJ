package aula20220801;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        //Faça um algoritmo para calcular o Indice de
        // Massa Corporal de uma pessoa, considerando
        // a seguinte formula: IMC = PESO / (ALTURA^2)
        // Se a pessoa tiver IMC MENOR OU IGUAL A 18.5,
        // mostre a mensagem abaixo: "Parabens! Voce esta
        // no seu peso ideal" Senão mostre a mensagem
        // abaixo: "Voce nao esta na faixa de peso ideal"
        Scanner teclado = new Scanner(System.in);
        double imc, peso, altura;
        System.out.println("Peso: ");
        peso = teclado.nextDouble();
        System.out.println("Altura: ");
        altura = teclado.nextDouble();
        imc = peso / Math.pow(altura, 2);
        if (imc <= 18.5) {
            System.out.println("Parabens! Voce esta no seu peso ideal");
        } else {
            System.out.println("Voce nao esta na faixa de peso ideal");
        }
    }
}