import javax.swing.JOptionPane;

public class Licao6v1 {

    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, nota3 = 0;

        while (true) {
            String input1 = JOptionPane.showInputDialog(null, "Digite a primeira nota (entre 0 e 10):");

            if (input1 == null) { 
                JOptionPane.showMessageDialog(null, "Operação Cancelada!.");
                System.exit(0);
            } else if (input1.isEmpty()) { 
                JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                continue;
            } else {
                nota1 = Double.parseDouble(input1);

                if (nota1 < 0 || nota1 > 10) {
                    JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                    continue;
                }
            }

            String input2 = JOptionPane.showInputDialog(null, "Digite a segunda nota (entre 0 e 10):");

            if (input2 == null) {                
                JOptionPane.showMessageDialog(null, "Operação Cancelada!.");
                System.exit(0);
            } else if (input2.isEmpty()) { 
                JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                continue;
            } else {
                nota2 = Double.parseDouble(input2);

                if (nota2 < 0 || nota2 > 10) {
                    JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                    continue;
                }
            }

            String input3 = JOptionPane.showInputDialog(null, "Digite a terceira nota (entre 0 e 10):");

            if (input3 == null) {
                JOptionPane.showMessageDialog(null, "Operação Cancelada!.");
                System.exit(0);
            } else if (input3.isEmpty()) { 
                JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                continue;
            } else {
                nota3 = Double.parseDouble(input3);

                if (nota3 < 0 || nota3 > 10) {
                    JOptionPane.showMessageDialog(null, "nota inválida! Tente novamente.");
                    continue;
                }
            }

            break; 
        }

        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A média aritmética dos notas é: " + media);

        System.exit(0);
    }

}