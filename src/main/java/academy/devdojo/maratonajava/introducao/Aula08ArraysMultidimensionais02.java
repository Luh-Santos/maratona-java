package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        // Para usar o foreach a gente usa um array
        for(int[] arrayBase: dias){
            // Criei um array temporário chamado arrayBase que vai armazenar a posição atual do array dias
            // O foreach vai percorrer cada elemento da base do array
            for(int num: arrayBase){
                //  Criei uma variável inteira temporária chamada num que vai armazenar o valor atual do array arrayBase
                System.out.println(num);
            }
        }
    }
}
