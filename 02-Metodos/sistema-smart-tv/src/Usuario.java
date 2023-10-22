public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //criando uma classe para ilustrar
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirrVolume();
        smartTv.diminuirrVolume();
        smartTv.diminuirrVolume();
        smartTv.aumetarVolume();

        System.out.println("Canal atual: " +smartTv.canal);
        
        smartTv.mudarDeCanal(13);

        System.out.println("Canal atual: " +smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("A tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> tv ligada? " + smartTv.ligada);
    }
}
