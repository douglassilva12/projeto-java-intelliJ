package Atividade02;

import java.util.Scanner;
public class exercicio67 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double contador = 1;
        double menor = 0;
        double maior = 0;


        for (int i = 0; i < contador; i++) {
            System.out.println("informe o valor de um numero inteiro positivo, caso queira cancelar o comando digite -1");
            double numero = teclado.nextDouble();

            if (numero < 0) {
                contador--;
            }
            if (maior == 0) {
                maior = numero;
            }
            if (menor == 0) {
                menor = numero;
            }

            if (numero > 0 & numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }
        System.out.println("o menor numero presente na sequencia é " + menor);
    }
}