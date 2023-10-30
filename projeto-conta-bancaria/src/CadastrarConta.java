import java.util.InputMismatchException;
import java.util.Scanner;
public class CadastrarConta {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int opcao;

        try {
            do  {
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
                        break;
                    case 2:
                        System.out.println("2. Cadastrar Conta Poupança");
                        break;
                    case 3:
                        System.out.println("3. Listar Contas");
                        break;
                    case 4:
                        System.out.println("4. Alterar Conta");
                        break;
                    case 5:
                        System.out.println("5. Excluir Conta");
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
