

class ContaBancaria implements Gerenciador {
    
    private String numeroConta;
    private String agencia;
    private double saldo;
    private Cliente cliente;
    private Banco banco;

    //set e gett
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
    //construtor
    public ContaBancaria(String numeroConta, String agencia, double saldo, Cliente cliente, Banco banco) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
    }

    //metodos abstratos


    @Override
    public String toString() {
        return "ContaBancaria [numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", banco=" + banco.getNome() + "]";
    }

    @Override
    public void adicionarConta(ContaBancaria conta) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'adicionarConta'");
    }

    @Override
    public void lerContas() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'lerContas'");
    }

    @Override
    public void removerConta(String numero) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removerConta'");
    }

    @Override
    public void alterarConta(String numero, ContaBancaria novaConta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarConta'");
    }
}