public class SistemaMedida {
    public static void main(String[] args) {
        char medida = 'M';

        switch (medida) {
            case 'M':
                System.out.println("Media");
                break;
            case 'P':
                System.out.println("Pequena");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }

    }
}