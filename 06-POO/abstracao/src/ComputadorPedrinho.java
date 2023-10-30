package abstracao.src;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMensseger facebook = new FacebookMensseger();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        TelegramMessenger telegram = new TelegramMessenger();
        
        telegram.enviarMensagem();
        telegram.receberMensagem();


       
}
}
