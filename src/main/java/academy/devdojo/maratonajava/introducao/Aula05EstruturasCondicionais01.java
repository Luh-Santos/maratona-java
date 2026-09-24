package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // if precisa ter dentro do parênteses um booleano
        if (true) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
        /* se tiver apenas 1 linha de instrução dentro do if, não precisa das chaves, e pode deixar na mesma linha se quiser
        if (true)
            System.out.println("Dentro do if sem chaves");

        if (true) System.out.println("Dentro do if sem chaves");
        */
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        // Se isAutorizadoComprarBebida NÃO for verdadeiro, então...
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

    }
}
