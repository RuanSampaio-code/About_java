public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =  (short) numeroNormal;

        int num = 1;
        num = 2;

        System.out.println(num);

        //constantes
        final double VALOR_DE_PI = 3.14; //fromad e declarar constantes
       // VALOR_DE_PI = 10; //isso da erro
    }
}
