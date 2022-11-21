package aula20220809;

public class exercicio01 {
    public static void main(String[] args) {
        //Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos!”.
        int numero = 1, contador = 0, controle = 1;
        while (contador < controle) {
            System.out.println(numero + ": Eu gosto de estudar Algoritmos!");
            controle++;
            if (controle > 20) {
                contador = controle;
            }
            contador++;
            numero++;
        }
    }
}