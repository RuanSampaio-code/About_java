package conteudointerface.equipamentos.multifuncional;

import conteudointerface.equipamentos.Digitalizadoras.Digitalizadora;
import conteudointerface.equipamentos.copiadoras.Copiadora;
import conteudointerface.equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional  implements Copiadora, Digitalizadora, Impressora{

    
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando via equipamento multifunc");
    }


    public void digitalizar() {
        // TODO Auto-generated method stub
       System.out.println("digitalizando via equipamento multifunc");
    }


    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("imprmindo via equipamento multifunc");
    }
    
}
