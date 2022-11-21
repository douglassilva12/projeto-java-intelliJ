package aula20220808;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Dado o modelo(Fiat, Ford,GM, Wolskwagen,Toyota,Honda),
        // ano fabricação, cor e placa de 5 carros. Faca um algoritmo que:
        //a)Imprima quantos carros sao da cor verde e o percentual em relacao ao total.
        //b)Imprima quantos foram fabricados antes de 1990 percentual em relacao ao total;
        //c)Imprima quantos sao da Fiat e o percentual em relacao ao total;
        Scanner teclado = new Scanner(System.in);
        String modelo, cor, placa;
        int anoFabricacao, qtdAno = 0, qtdCor = 0, qtdMdl = 0, pctAno = 0, pctCor = 0, pctMdl = 0;
        int cont = 1;
        while (cont <=5) {
            System.out.println("Modelo: ");
            modelo = teclado.next();
            System.out.println("Ano fabricacao: ");
            anoFabricacao = teclado.nextInt();
            System.out.println("Cor: ");
            cor = teclado.next();
            System.out.println("Placa: ");
            placa = teclado.next();
            if (cor.equals("verde")) {
                qtdCor++;
                pctCor = pctCor + 20;
            }
            if (anoFabricacao < 1990) {
                qtdAno++;
                pctAno = pctAno + 20;
            }
            if (modelo.equals("fiat")) {
                qtdMdl++;
                pctMdl = pctMdl + 20;
            }
            cont++;
        }
        System.out.println("Carros com cor verde: " + qtdCor + ". Porcentagem: " + pctCor);
        System.out.println("Carros feitos antes de 1990: " + qtdAno + ". Porcentagem: " + pctAno);
        System.out.println("Carros da fiat: " + qtdMdl + ". Porcentagem: " + pctMdl);
    }
}