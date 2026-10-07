package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch, dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo.

        byte dia = 10;
        boolean isDiaUtil = false;
        switch (dia) {
            case 1:
                isDiaUtil = false;
                break;
            case 2:
                isDiaUtil = true;
                break;
            case 3:
                isDiaUtil = true;
                break;
            case 4:
                isDiaUtil = true;
                break;
            case 5:
                isDiaUtil = true;
                break;
            case 6:
                isDiaUtil = true;
                break;
            case 7:
                isDiaUtil = false;
                break;
            default:
                System.out.println("Opção inválida");
        }

        String mensagem = isDiaUtil ? "É dia útil" : "É final de semana";
        System.out.println(mensagem);

        // Resolução do instrutor:
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
