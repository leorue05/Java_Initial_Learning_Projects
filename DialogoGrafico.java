import javax.swing.*;

public class DialogoGrafico{

    public static void main(String args []) {

        String nm = JOptionPane.showInputDialog(null,"Informe seu nome");
        JOptionPane.showMessageDialog(null, nm+": SEJA BEM-VIADO!!");
        System.exit(0);

    }

}