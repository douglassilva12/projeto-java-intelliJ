package aula20220727;

import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        //Escreva um algoritmo que lê dois valores booleanos (lógicos)
        // e então determina se ambos são VERDADEIROS ou FALSOS.
        // Obs:Faça uma pergunta por exemplo:Você é maior de idade?Responda SIM ou NAO.
        // Atribua o valor conforme o caso e no final mostre a resposta:
        // A pessoa é maior de idade, se a resposta for SIM
        // A pessoa é menor de idade, se a resposta for NAO
        Scanner teclado = new Scanner(System.in);
        boolean maioridade = false;
        String respostaIdade = "";
        System.out.println("Maior de idade?");
        respostaIdade = teclado.next();
        if (respostaIdade.equals("Sim")) {
            maioridade = true;
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
}