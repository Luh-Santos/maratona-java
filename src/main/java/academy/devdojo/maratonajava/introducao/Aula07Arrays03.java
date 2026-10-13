package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5}; // Inicializando Array diretamente com os valores
        int[] numeros3 = new int[]{5, 4, 3, 2, 1}; // Inicializando com os valores com sintaxe diferente
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Números 2: " + numeros2[i]);
        }
        // foreach - O tipo int representa cada elemento do array, e a variável i recebe o valor do elemento atual a cada repetição
        for (int i : numeros3) {
            System.out.println("Números 3: " + i);
        }
    }
}
