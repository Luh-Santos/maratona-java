package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // se idade < 15 imprimir categoria infantil
        // se idade >= 15 && idade < 18 imprimir categoria juvenil
        // se idade >= 18 imprimir categoria adulto
        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
        categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
