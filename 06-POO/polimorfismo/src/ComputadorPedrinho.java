package polimorfismo.src;

import polimorfismo.src.apps.FacebookMensseger;
import polimorfismo.src.apps.MSNMessenger;
import polimorfismo.src.apps.ServicoMensagemInstantanea;
import polimorfismo.src.apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
       /*  MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMensseger facebook = new FacebookMensseger();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        TelegramMessenger telegram = new TelegramMessenger();
        
        telegram.enviarMensagem();
        telegram.receberMensagem(); */
        
		
        ServicoMensagemInstantanea smi = null;
        
        /*
            NÃO SE SABE QUAL APP 
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
            */
        String appEscolhido="msn"; 
        
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMensseger();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();
        
            
        smi.enviarMensagem();
        smi.receberMensagem();
        

    }


       

}
