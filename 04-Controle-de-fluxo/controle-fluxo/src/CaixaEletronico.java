public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicidado = 28;
        //condição simples
        /* if (valorSolicidado <saldo ) 
            saldo = saldo - valorSolicidado;
        System.out.println(saldo); */
        
        //deixando mais complexa

        if (valorSolicidado < saldo) {
            saldo = saldo - valorSolicidado;
            System.out.println("Novo Saldo: " + saldo);
        } else {
             System.out.println("Saldo Insuficiente " );
        }
        
    }
}
