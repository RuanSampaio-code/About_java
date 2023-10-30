public class Conta implements InterfaceConta{
    
    //atributos
    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    //implmentando os metodos da inferface
    @Override
    public void mostrarDados() {
        // TODO Auto-generated method stub
        System.out.println("Numero da conta: " +numeroConta);
        System.out.println("Numero da Agencia: " +numeroConta);
        System.out.println("Saldo atual: " +numeroConta);
    }
 
    //getNumeroConta e getAgencia
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //getAgencia e  setAgencia
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    //getSaldo e  setSaldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
