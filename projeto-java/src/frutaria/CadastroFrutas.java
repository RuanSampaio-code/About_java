package frutaria;
import java.util.Scanner;
import java.util.InputMismatchException;


public class CadastroFrutas {

    public static void main(String[] args) {
        
        int opcao ;
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Fruta");
        System.out.println("2. Cadastrar Funcionário");
        System.out.println("3. Listar Frutas");
        System.out.println("4. Alterar Fruta");
        System.out.println("5. Excluir Fruta");
        System.out.println("0. Sair");
        
        Scanner input = new  Scanner(System.in);
        opcao = input.nextInt();

       
        while (opcao != 0){
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Fruta");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Listar Frutas");
            System.out.println("4. Alterar Fruta");
            System.out.println("5. Excluir Fruta");
            System.out.println("0. Sair");
            
            try {
                opcao = input.nextInt();
            }catch (InputMismatchException e){
                 System.out.println("Nao aceitamos valores tipo caracter");
            }

            
            switch (opcao) {
                case 1:
                    System.out.println("1. Cadastrar Fruta");

                    break;
                case 2:
                    System.out.println("2. Cadastrar Funcionário");
                    break;
                case 3:
                    System.out.println("3.Listar Frutas");
                    break;
                case 4:
                    System.out.println("4. Alterar Fruta");
                    break;
                case 5:
                    System.out.println("5. Excluir Fruta");
                    break;
                case 0:
                    System.out.println("0. Sair");
                    break;   
                default:
                    System.out.println("Invalido Digite outro valor");
                    break;
            }
        }
    }
}
