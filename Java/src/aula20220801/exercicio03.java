package aula20220801;

public class exercicio03 {
    public static void main(String[] args) {
        //Vou e volto diariamente a pé para o trabalho,
        // que dista aproximadamente 800 m de minha casa.
        // Supondo que trabalho 5 dias por semana, 45 semanas por ano,
        // "bole" a operação matemática que deve ser efetuada
        // para calcular quantos quilômetros, aproximadamente,
        // terei andado ao final de um ano.
        // Elabore um programa que faça as contas e mostre o resultado

        int resultado;
        resultado = (45 * 5) * (800 / 1000);
        System.out.println("Distancia: " + resultado + " quilometros");
    }
}