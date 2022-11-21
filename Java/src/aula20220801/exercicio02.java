package aula20220801;

public class exercicio02 {
    public static void main(String[] args) {
        //Uma pessoa com pouco tempo disponível lê um livro
        // por 5 minutos a cada dia, 6 dias por semana.
        // Monte a fórmula e escreva um programa que
        // calcula e mostra na tela quanto tempo, em horas,
        // a pessoa terá dedicado ao livro ao final de um ano.

        int a, resultado;
        //52 semanas * 6 dias
        //1 dia que não está numa semana completa
        a = ((52 * 6) + 1) * 5;
        resultado = a / 60;
        System.out.println("Tempo: " + resultado + " horas");
    }
}