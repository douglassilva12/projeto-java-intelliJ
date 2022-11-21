package aula20220808;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Dada uma relacao de 5 nomes de carros, imprima quantos sao da cor azul.
        //Sendo que para cada carro tem-se uma ficha contendo a cor e o nome.
        Scanner teclado = new Scanner(System.in);
        String cor, nome;
        int qtdCor = 0, cont = 1;
        while (cont <= 5) {
            System.out.println("Cor: ");
            cor = teclado.next();
            System.out.println("Nome: ");
            nome = teclado.next();
            if (cor.equals("azul")) {
                qtdCor++;
            }
            cont++;
        }
        System.out.println("Carros com cor verde: " + qtdCor);
    }
}