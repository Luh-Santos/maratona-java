package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Variáveis arrays são sempre do tipo reference, não são do tipo primitivo
        // Arrays são objetos
        // Variáveis tipo reference podem iniciar como null, primitivas não
        int [] idades = new int[3]; // Ao declarar um array precisa já dizer quantos espaços de memória ele vai ter, nesse caso 3
        // pode declarar tbm como: int idades[];

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
