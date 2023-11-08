import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroContasBancarias extends JFrame {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private JTextField campoNome;
    private JTextField campoSaldoInicial;
    private JComboBox<String> tipoConta;
    private JTextArea areaContas;

    public CadastroContasBancarias() {
        setTitle("Cadastro de Contas Bancárias");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 2));

        JLabel labelNome = new JLabel("Nome do Titular:");
        campoNome = new JTextField(20);

        JLabel labelSaldo = new JLabel("Saldo Inicial:");
        campoSaldoInicial = new JTextField(20);

        JLabel labelTipoConta = new JLabel("Tipo de Conta:");
        String[] tipos = {"Conta Corrente", "Conta Poupança"};
        tipoConta = new JComboBox<>(tipos);

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoListar = new JButton("Listar Contas");
        JButton botaoExcluir = new JButton("Excluir Conta");

        areaContas = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaContas);

        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelSaldo);
        painel.add(campoSaldoInicial);
        painel.add(labelTipoConta);
        painel.add(tipoConta);
        painel.add(botaoCadastrar);
        painel.add(botaoListar);
        painel.add(botaoExcluir);
        painel.add(new JLabel()); // Espaço em branco
        painel.add(scrollPane);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                double saldo = Double.parseDouble(campoSaldoInicial.getText());
                String tipo = (String) tipoConta.getSelectedItem();

                ContaBancaria conta = null;
                if (tipo.equals("Conta Corrente")) {
                    conta = new ContaCorrente(nome, saldo);
                } else if (tipo.equals("Conta Poupança")) {
                    conta = new ContaPoupanca(nome, saldo);
                }

                if (conta != null) {
                    contas.add(conta);
                    areaContas.append("Conta cadastrada: " + conta + "\n");
                    campoNome.setText("");
                    campoSaldoInicial.setText("");
                }
            }
        });

        botaoListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaContas.setText("");
                for (ContaBancaria conta : contas) {
                    areaContas.append(conta.toString() + "\n");
                }
            }
        });

        botaoExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeExcluir = campoNome.getText();
                for (ContaBancaria conta : contas) {
                    if (conta.getNomeTitular().equals(nomeExcluir)) {
                        contas.remove(conta);
                        areaContas.append("Conta excluída: " + conta + "\n");
                        break;
                    }
                }
                campoNome.setText("");
            }
        });

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroContasBancarias();
            }
        });
    }
}
