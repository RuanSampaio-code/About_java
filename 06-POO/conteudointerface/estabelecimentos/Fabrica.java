package conteudointerface.estabelecimentos;

import conteudointerface.equipamentos.Digitalizadoras.Digitalizadora;
import conteudointerface.equipamentos.copiadoras.Copiadora;
import conteudointerface.equipamentos.impressoras.Deskjet;
import conteudointerface.equipamentos.impressoras.Impressora;
import conteudointerface.equipamentos.impressoras.LaserJet;
import conteudointerface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        
        Impressora impressora =em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

    
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        
    }
}
