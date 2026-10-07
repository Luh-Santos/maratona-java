package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        /*
        Salário de 0 a 34712 taxa = 9.70%
        Salário de 34713 a 68507 taxa = 37.35%
        Salário > 68508 taxa = 49.50%
         */
        double salarioAnual = 68508;
        double porcentagem;

        if (salarioAnual <= 34712) {
            porcentagem = 9.70;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            porcentagem = 37.35;
        } else {
            porcentagem = 49.50;
        }

        double impostoAPagar = salarioAnual * (porcentagem / 100);
        System.out.println("Você precisa pagar €" + impostoAPagar + " de impostos");
    }
}
