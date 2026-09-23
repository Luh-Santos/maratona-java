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

        // Resto da divisão %
        int resto = 20 % 2;
        System.out.println("resto: " + resto);

        // Operadores relacionais, retornam booleano. Menor que < Maior que > Menor ou igual <= Maior ou igual >= Igual == Diferente !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // Operadores Lógicos. E && OU || NÃO !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // Operadores Atribuição. Igual = Mais igual += Menos igual -= Multiplicação igual *= Divisão igual /= Resto igual %=
        double bonus = 1800;
        // bonus = bonus + 1000
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println("Bônus " + bonus);

        // Operadores unários. Incremento ++ Decremento --
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        contadorPositivo++; //contadorPositivo = contadorPositivo + 1;
        contadorNegativo--; // contadorNegativo = contadorNegativo - 1;
        int contadorPositivoAntes = 0;
        int contadorPositivoDepois = 0;
        System.out.println("Contador Positivo " + contadorPositivo);
        System.out.println("Contador Negativo " + contadorNegativo);
        System.out.println("Contador Positivo depois " + contadorPositivoDepois++);
        System.out.println("Contador Positivo antes " + ++contadorPositivoAntes);
    }
}
