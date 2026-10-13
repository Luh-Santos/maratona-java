package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /* Tipos primitivos tem valores padrões quando estão fora do méto.do ou dentro de Arrays
            byte, short, int, long e double é 0
            char é u000 que representa um espaço em branco ' '
            boolean é false
            String é null
         */

        byte[] exemploByte = new byte[2];
        short[] exemploShort = new short[2];
        int[] exemploInt = new int[2];
        long[] exemploLong = new long[2];
        char[] exemploChar = new char[2];
        boolean[] exemploBoolean = new boolean[2];
        String[] exemploString = new String[2];

        System.out.println("Byte: " + exemploByte[0]);
        System.out.println("Short: " + exemploShort[0]);
        System.out.println("Int: " + exemploInt[0]);
        System.out.println("Long: " + exemploLong[0]);
        System.out.println("Char: " + exemploChar[0]);
        System.out.println("Boolean: " + exemploBoolean[0]);
        System.out.println("String: " + exemploString[0]);
    }
}
