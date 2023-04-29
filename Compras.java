import javax.swing.*;

public class Compras {

    public static void main(String args[]) {

        String lista ="Lista de Compras: ";

        for(byte nrItem=1; nrItem<=5; nrItem++){

            String str ="Digite o nome do Item";
            str = JOptionPane.showInputDialog(null, str);

            if (str==null){

                JOptionPane.showMessageDialog(null, "Nenhum item selecionado!", "ERRO",0);
                System.exit(0);

            }else if(str.trim().length()>0){

                lista+="\nItem"+nrItem+": "+str;
            
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum item selecionado!", "ERRO",0);
                System.exit(0);

            }
        }

        JOptionPane.showMessageDialog(null, lista);
        
    }
    
}
