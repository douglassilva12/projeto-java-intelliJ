package aula20220829;

public class exercicio01 {
    public static void main(String[] args) {
        // Exercícios sobre métodos
        //Crie uma classe chamada Calculadora. Esta classe deve possuir os seguintes métodos:
        //public double operacao(double num1, double num2); Retorna a soma dos dois números.
        //public double operacao(int num1, double num2); Retorna a subtração dos dois números.
        //public double operacao(double num1, int num2); Retorna o produto dos dois números.
        //public double operacao(int num1, int num2); Retorna o resultado da divisão dos dois números.
        //public double operacao(int num1, short num2); Retorna o resto da divisão dos dois números.
        //Elabore um roteiro de teste para a sua calculadora e observe os resultados.
        double somaRetorno=soma(15,10);
        double subtracaoRetorno=subtracao(15,10);
        double produtoRetorno=produto(15,10);
        double divisaoRetorno=divisao(15,10);
    }
    public static double soma(double num1, double num2){
        double soma=num1+num2;
        System.out.println("soma: "+soma);
        return soma;
    }
    public static double subtracao(int num1, double num2){
        double subtracao=num1-num2;
        System.out.println("subtracao: "+subtracao);
        return subtracao;
    }
    public static double produto(double num1, int num2){
        double produto=num1*num2;
        System.out.println("produto: "+produto);
        return produto;
    }
    public static double divisao(int num1, int num2){
        double divisao=num1/num2;
        System.out.println("divisao: "+divisao);
        return divisao;
    }
}
