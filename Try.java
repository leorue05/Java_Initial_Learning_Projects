import javax.swing.*;

public class Try{
    public static void main(String args[]){

        String str;
        int quo=0;

        try{
            str = JOptionPane.showInputDialog(null, "Informe o dividendo: ");
            int dividendo = Integer.parseInt(str);
            
            str = JOptionPane.showInputDialog(null, "Informe o divisor: ");
            int divisor = Integer.parseInt(str);

            quo = dividendo/divisor;
            JOptionPane.showMessageDialog(null, "Resultado :"+quo);
        }catch(Exception e){str="Ocorreu um erro!!!\n Tipo: "+e.getClass()+"\nMensagem: "+e.getMessage();
        JOptionPane.showMessageDialog(null, str,"Erro!",0);
    }


}
}