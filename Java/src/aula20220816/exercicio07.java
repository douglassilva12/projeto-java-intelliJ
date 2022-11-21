package aula20220816;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /*
        Amplie o exercício 06 imprimindo o menor Nome do vetor
        (usar função length() do JAVA)
        (A função length() retorna o número de caracteres inseridos numa variável.
        Ex.: Caso o usuario digitar o nome Maria, o strlen() retornará o valor 05.
        */
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[10];
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println("Digite o " + (cont + 1) + " nome: ");
            nome[cont] = teclado.next();
            nome[cont].length();
        }
        int menor = nome[0].length();
        String menorNome = nome[0];
        for (int x = 0; x < nome.length; x++) {
            if (nome[x].length() < menor) {
                menor = nome[x].length();
                menorNome = nome[x];
            }
        }
        System.out.println("Nome: " + menorNome);
    }
}