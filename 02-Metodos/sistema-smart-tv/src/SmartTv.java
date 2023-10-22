public class SmartTv {
   
    //criando atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //criando metodos 
    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarDeCanal(){
        canal++;
    }

    public void diminuirDeCanal(){
        canal++;
    }

    public void aumetarVolume(){
        volume ++;
        System.out.println("aumentando para " + volume);
    }

    public void diminuirrVolume(){
        volume --;
        System.out.println("diminuindo para " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    

}
