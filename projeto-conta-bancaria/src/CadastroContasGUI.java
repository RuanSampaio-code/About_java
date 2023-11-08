import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroContasGUI {

    private ArrayList<String> contas = new ArrayList<String>();

    public CadastroContasGUI() {
        JFrame frame = new JFrame("Cadastro de Contas Bancarias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new GridLayout(6, 1));

        JButton btnCadastrarCorrente = new JButton("1. Cadastrar Conta Corrente");
        JButton btnCadastrarPoupanca = new JButton("2. Cadastrar Conta Poupança");
        JButton btnListarContas = new JButton("3. Listar Contas");
        JButton btnAlterarConta = new JButton("4. Alterar Conta");
        JButton btnExcluirConta = new JButton("5. Excluir Conta");
        JButton btnSair = new JButton("6. Sair");

        // Altere o tamanho dos botões usando setPreferredSize ou setSize
        Dimension buttonSize = new Dimension(20, 30);
        btnCadastrarCorrente.setPreferredSize(buttonSize);
        btnCadastrarPoupanca.setPreferredSize(buttonSize);
        btnListarContas.setPreferredSize(buttonSize);
        btnAlterarConta.setPreferredSize(buttonSize);
        btnExcluirConta.setPreferredSize(buttonSize);
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
                contas.add("Conta Corrente: " + conta);
                JOptionPane.showMessageDialog(null, "Conta Corrente cadastrada com sucesso!");
            }
        });

        btnCadastrarPoupanca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = JOptionPane.showInputDialog("Digite os detalhes da Conta Poupança:");
                contas.add("Conta Poupança: " + conta);
                JOptionPane.showMessageDialog(null, "Conta Poupança cadastrada com sucesso!");
            }
        });

        btnListarContas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder lista = new StringBuilder("Lista de Contas:\n");
                for (String conta : contas) {
                    lista.append(conta).append("\n");
                }
                JOptionPane.showMessageDialog(null, lista.toString());
            }
        });

        btnAlterarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contaAntiga = JOptionPane.showInputDialog("Digite o nome da Conta que deseja alterar:");
                for (int i = 0; i < contas.size(); i++) {
                    if (contas.get(i).contains(contaAntiga)) {
                        String novaConta = JOptionPane.showInputDialog("Digite os novos detalhes da Conta:");
                        contas.set(i, contas.get(i).split(":")[0] + ": " + novaConta);
                        JOptionPane.showMessageDialog(null, "Conta alterada com sucesso!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        });

        btnExcluirConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = JOptionPane.showInputDialog("Digite o nome da Conta que deseja excluir:");
                for (int i = 0; i < contas.size(); i++) {
                    if (contas.get(i).contains(conta)) {
                        contas.remove(i);
                        JOptionPane.showMessageDialog(null, "Conta excluída com sucesso!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
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
