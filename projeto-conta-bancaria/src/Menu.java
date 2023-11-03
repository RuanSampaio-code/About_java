import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
       
        //chama gerenciador
        Gerenciador gerencia = new GerenciadorImplementa();

        //List<ContaBancaria> contas = new ArrayList<>();
        Scanner input = new  Scanner(System.in);
        int opcao;

        try {
            do {
                System.out.println("Menu:");
                System.out.println("1. Cadastrar Conta Corrente");
                System.out.println("2. Cadastrar Conta Poupança");
                System.out.println("3. Listar Contas");
                System.out.println("4. Alterar Conta");
                System.out.println("5. Excluir Conta");
                System.out.println("0. Sair");
            
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("1. Cadastrar Conta Corrente");
                        
                        //numero da conta
                        System.out.println("Informe o numero da conta: ");
                        String numeroConta = input.next();

                        //numero da agencia
                        System.out.println("Informe a agencia: ");
                        String agencia = input.next();

                        //saldo
                        System.out.println("Informe o saldo que deseja depositar ");
                        double saldo = input.nextDouble();

                        //cliente
                        System.out.println("Informe o nome do cliente ");
                        String nomeCliente = input.next();

                        //banco
                        System.out.println("Informe o Banco ");
                        String nomebanco = input.next();

                        //chamando instacia de cliente e do banco
                        Cliente cliente = new Cliente(nomeCliente);
                        Banco banco = new Banco(nomebanco);

                        //instacia de banco
                        ContaBancaria newConta = new ContaBancaria( numeroConta, agencia, saldo, cliente, banco);
                        //contas.add(newConta);
                        gerencia.adicionarConta(newConta);
                       
                        break;
                    case 2:

                        System.out.println("2. Cadastrar Conta Poupança");
                        break;
                    case 3:

                        System.out.println("3. Listar Contas");
                        gerencia.lerContas();
                        break;

                    case 4:
                        System.out.println("4. Alterar Conta");
                        
                        //buscando numero da conta a ser alterado
                        System.out.println("Informe o número da conta a ser alterada: ");
                        String numConta = input.next();

                        //nova agencia
                        System.out.println("Informe a nova agência: ");
                        String novaAgencia = input.next();
                        
                        //novo numero da conta
                        System.out.println("Informe o novo número da conta: ");
                        String novoNumero = input.next();

                        //novo saldo
                        System.out.println("Informe o novo número da conta: ");
                        Double novoSaldo = input.nextDouble();

                        //novo nome da conta
                        System.out.println("Informe o nome do novo cliente: ");
                        String novoNomeCliente = input.next();

                        //banco
                        System.out.println("Informe o do novo banco ");
                        String novoNomeBanco = input.next();
            
                        //atribuindo nova class nome cliente e banco
                        Cliente novoCliente = new Cliente(novoNomeCliente);
                        Banco novoBanco = new Banco(novoNomeBanco);

                        //Classe Conta bancaria alteradas
                        ContaBancaria novaConta = new ContaBancaria(novoNumero, novaAgencia, novoSaldo, novoCliente,novoBanco );
                        
                        gerencia.alterarConta(novoNumero, novaConta); 

                        break;

                    case 5:
                        System.out.println("5. Excluir Conta");
                        System.out.println("Informe o número da conta a ser deletada: ");
                        String deletenumeroConta = input.next();
                        gerencia.removerConta(deletenumeroConta);

                        break;
                    case 0:
                        System.out.println("Saindo do programa");
                        break;
                    default:
                        System.out.println("Invalido Digite outro valor");
                        break;
                }

            
            } while (opcao != 0);
            
        }catch (InputMismatchException e){
         System.out.println("Nao aceitamos valores tipo caracter");
        }
        
    }
}
