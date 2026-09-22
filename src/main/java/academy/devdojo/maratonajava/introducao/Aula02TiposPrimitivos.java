package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereASCII = 87;
        char caractere = 'A';
        // String não é um tipo primitivo, é um tipo de referência
        String nome = "Luísa";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("W na tabela ASCII é 87: " + caractereASCII);
        System.out.println("Oi, meu nome é " + nome);

        /*
            Casting: Forçar o valor de uma variável em outra
            Ao printar, caso o valor seja maior que o tipo suporta, o sistema vai cortar bytes e dar um resultado diferente
                Exemplo:
        */
        int numeroMaiorQueIntAceita = (int) 10000000000L;
        System.out.println("Número casting: " + numeroMaiorQueIntAceita);

    }
}
