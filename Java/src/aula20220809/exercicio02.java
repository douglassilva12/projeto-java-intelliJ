package aula20220809;

public class exercicio02 {
    public static void main(String[] args) {
        //Escreva um algoritmo que calcule a soma dos números de 1 a 15.
        int soma = 0;
        for (int x = 1; x <= 15; x++) {
            soma += x;
            System.out.println("Numero: " + x + ", soma: " + soma);
        }
        System.out.println("\nresultado: " + soma);
    }
}