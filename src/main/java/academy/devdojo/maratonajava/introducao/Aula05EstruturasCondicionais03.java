package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operadores Ternários
        // Doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condição) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        /*
        Exemplo com else if
        se idade < 15 imprimir categoria infantil
        se idade >= 15 && idade < 18 imprimir categoria juvenil
        se idade >= 18 imprimir categoria adulto
         */
        int idade = 17;
        String categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
