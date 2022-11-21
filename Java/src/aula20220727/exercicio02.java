package aula20220727;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia o nome, o sexo("F" ou "M") e o estado civil de uma pessoa.
        //Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).
        //Ao final do algoritmo imprima os dados lidos.
        Scanner teclado = new Scanner(System.in);
        String nome = "", sexo = "", estadoCivil = "";
        int tempoCasada = 0;
        System.out.println("Nome: " + nome);
        nome = teclado.next();
        System.out.println("Sexo: " + sexo);
        sexo = teclado.next();
        System.out.println("Estado Civil: " + estadoCivil);
        estadoCivil = teclado.next();
        if (sexo.equals("F") & estadoCivil.equals("Casada")) {
            System.out.println("Tempo casada: ");
        }
    }
}