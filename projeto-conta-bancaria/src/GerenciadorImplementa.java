import java.util.ArrayList;
import java.util.List;

public class GerenciadorImplementa implements Gerenciador{
    
    
    private List<ContaBancaria> contas = new ArrayList<>();
    
    @Override
    public void adicionarConta(ContaBancaria conta) {
        // TODO Auto-generated method stub
        contas.add(conta);
        System.out.println("Conta bancária cadastrada com sucesso.");
    }

    @Override
    public void alterarConta(String numero, ContaBancaria novaConta) {
        // TODO Auto-generated method stub
        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = contas.get(i);
            if (conta.getNumeroConta().equals(numero)) {
                contas.set(i, novaConta);
                System.out.println("Conta bancária alterada com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada para alteração.");
        
    }

    @Override
    public void lerContas() {
        // TODO Auto-generated method stub
        System.out.println("Contas Bancárias cadastradas:");
        for (ContaBancaria conta : contas) {
            System.out.println("=======================================");
            System.out.println("Número conta: " + conta.getNumeroConta());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Cliente: " + conta.getCliente().getNome() );
            System.out.println("Banco: " + conta.getBanco().getNome());
        }
        
    }


    @Override
    public void removerConta(String numero) {
        // TODO Auto-generated method stub
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numero)) {
                contas.remove(conta);
                System.out.println("Conta bancária deletada com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada para deleção.");
    }
    
}
