package aula20220727;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //Tendo como dados de entrada a altura e o sexo de uma pessoa,
        // construa um algoritmo que calcule seu peso ideal,
        // utilizando as seguintes fórmulas:
        //para homens: (72.7 * h) – 58;
        //para mulheres: (62.1 * h) – 44.7.
        //Ao final do mesmo, informe se a pessoa tem peso ideal ou não.
        Scanner teclado = new Scanner(System.in);
        String sexo;
        double altura, peso, resultado;
        System.out.println("sexo: ");
        sexo = teclado.next();
        System.out.println("altura: ");
        altura = teclado.nextDouble();
        System.out.println("peso: ");
        peso = teclado.nextDouble();
        if (sexo.equals("Masculino")) {
            resultado = (72.7 * altura) - 58;
        } else {
            resultado = (62.1 * altura) - 44.7;
        }
        if (peso > resultado) {
            System.out.println("Acima do peso ideal!");
        } else {
            System.out.println("Está no peso ideal!");
        }
    }
}