import javax.swing.*;

public class ValidaNome{

    public static void main(String args[]) {

        String nome;
        boolean nomeValido = false;

        while(nomeValido == false){

            nome = JOptionPane.showInputDialog(null, "Informe seu nome");

            if (nome==null){

                JOptionPane.showMessageDialog(null, "nenhum nome informado");
                System.exit(0);
        }else if(nome.trim().length()<5 || nome.trim().length()>50){

            JOptionPane.showMessageDialog(null,"Nome deve terentre 5 e 50 caracteres","ERRO",0);
        }else{
            nomeValido=true;
            JOptionPane.showMessageDialog(null, "Nome valido "+nome, "mensagem", 1);

        }
        
    }

}
}