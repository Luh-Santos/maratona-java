package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Luísa";
        String endereco = "Rua dos Bobos, N° 0";
        double salario = 4000.55;
        String data = "22/09/2026";
        String fraseCompleta = "Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + ", na data " + data;
        System.out.println(fraseCompleta);
    }
}
