package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores básicos: Soma + Subtração - Divisão / Multiplicação *
        int numero01 = 10;
        int numero02 = 20;
        double numero03 = 30;
        double numero04 = 40;
        int resultadoSoma = numero01 + numero02;
        System.out.println("Se tiver texto antes o + será de concatenação, não de operação aritmética: " + numero01 + numero02);
        System.out.println("Resultado Soma: " + resultadoSoma);
        System.out.println(numero02 - numero01);
        System.out.println(numero01 * numero02);
        System.out.println("O resultado de uma operação de 2 números inteiros sempre será um número inteiro " + numero01 / numero02);
        System.out.println(numero03 / numero04);
    }
}
