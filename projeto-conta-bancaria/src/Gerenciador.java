public interface Gerenciador {

    public abstract void adicionarConta(ContaBancaria conta);
    public abstract void lerContas();
    public abstract void alterarConta(String numero, ContaBancaria novaConta);
    public abstract void removerConta(String numero);
    public abstract void quantidadeContas();

   

    
}
