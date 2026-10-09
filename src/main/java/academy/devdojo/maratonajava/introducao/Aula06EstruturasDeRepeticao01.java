package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
            // se quiser imprimir de 1 a 10 pode usar somente: System.out.println(++count);
        }

        do {
            System.out.println("dentro do do-while sempre vai executar pelo menos 1 vez");
        } while ( count < 10 );

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
