import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CadastroContasGUI {

    private GerenciadorImplementa gerenciador; // Usando a implementação do Gerenciador
    private List<String> contas = new ArrayList<String>();

    public CadastroContasGUI() {
        gerenciador = new GerenciadorImplementa();

        JFrame frame = new JFrame("Cadastro de Contas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new FlowLayout());

        // Tamanho personalizado para os botões
        Dimension buttonSize = new Dimension(200, 30);

        JButton btnCadastrarCorrente = new JButton("1. Cadastrar Conta Corrente");
        btnCadastrarCorrente.setPreferredSize(buttonSize);
        JButton btnCadastrarPoupanca = new JButton("2. Cadastrar Conta Poupança");
        btnCadastrarPoupanca.setPreferredSize(buttonSize);
        JButton btnListarContas = new JButton("3. Listar Contas");
        btnListarContas.setPreferredSize(buttonSize);
        JButton btnAlterarConta = new JButton("4. Alterar Conta");
        btnAlterarConta.setPreferredSize(buttonSize);
        JButton btnExcluirConta = new JButton("5. Excluir Conta");
        btnExcluirConta.setPreferredSize(buttonSize);
        JButton btnSair = new JButton("6. Sair");
        btnSair.setPreferredSize(buttonSize);

        panel.add(btnCadastrarCorrente);
        panel.add(btnCadastrarPoupanca);
        panel.add(btnListarContas);
        panel.add(btnAlterarConta);
        panel.add(btnExcluirConta);
        panel.add(btnSair);

        btnCadastrarCorrente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = JOptionPane.showInputDialog("Digite os detalhes da Conta Corrente:");
                //Adciona tela que chame todos os atributos da conta correte em uma tela so
                
                // Aqui você pode chamar o método do gerenciador para adicionar a conta corrente
                gerenciador.adicionarConta(new ContaCorrente(conta, conta, 0, null, null));
                JOptionPane.showMessageDialog(null, "Conta Corrente cadastrada com sucesso!");
            }
        });

        btnCadastrarPoupanca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = JOptionPane.showInputDialog("Digite os detalhes da Conta Poupança:");
                //Adciona tela que chame todos os atributos da conta correte em uma tela so

                // Aqui você pode chamar o método do gerenciador para adicionar a conta poupança
                gerenciador.adicionarConta(new ContaPoupanca(conta, conta, 0, null, null));
                JOptionPane.showMessageDialog(null, "Conta Poupança cadastrada com sucesso!");
            }
        });

        btnListarContas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode chamar o método do gerenciador para listar as contas
                gerenciador.lerContas();
            }
        });

        btnAlterarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contaAntiga = JOptionPane.showInputDialog("Digite o número da Conta que deseja alterar:");
                // Aqui você pode chamar o método do gerenciador para alterar a conta
                gerenciador.alterarConta(contaAntiga, new ContaBancaria(contaAntiga, contaAntiga, 0, null, null)); // Preencha com os dados corretos
            }
        });

        btnExcluirConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = JOptionPane.showInputDialog("Digite o número da Conta que deseja excluir:");
                // Aqui você pode chamar o método do gerenciador para excluir a conta
                gerenciador.removerConta(conta);
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroContasGUI();
            }
        });
    }
}
