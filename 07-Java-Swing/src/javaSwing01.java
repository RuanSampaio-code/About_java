import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class javaSwing01 {

    public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(500,300); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Cadastro de contas bancarias  ");

        // componente JTextArea
       //TextArea miJTextArea = new JTextArea(5,10); 

        // conecta los componentes JLabel y JTextField en JPanel
        miJPanel.add(miJLabel);
        //miJPanel.add(miJTextArea);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}