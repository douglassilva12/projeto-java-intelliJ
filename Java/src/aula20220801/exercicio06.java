package aula20220801;

import java.util.Calendar;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        //Faça um algoritmo para verificar se uma pessoa
        // ja atingiu a maioridade. O algoritmo deve receber
        // como entrada apenas o ano de nascimento e considerar
        // o ano atual para calculo e 18 anos para maioridade.
        Scanner teclado = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int anoNascimento, idade;
        int anoAtual = cal.get(Calendar.YEAR);
        System.out.println("Ano nascimento: ");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println(idade);
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}