package aula20220801;

public class exercicio09 {
    public static void main(String[] args) {
        //Um estudante muito metódico estava matriculado em
        // 6 disciplinas, e dispunha de 1 hora e 40 minutos
        // para estudar. Sua intenção era dividir o tempo
        // disponível igualmente para as 6 disciplinas,
        // e descansar livremente o tempo restante.
        // Faça um programa que calcule o tempo que ele
        // deve dedicar para cada disciplina e o tempo livre.
        int resultado;
        //1h 40 min são 100 minutos
        // dividir o tempo (minutos) por 6 materias mais o tempo livre
        resultado = 100 / 7;
        System.out.println("Tempo: " + resultado + "minutos");
    }
}