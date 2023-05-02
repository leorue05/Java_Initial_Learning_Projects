import javax.swing.*;

public class Break {

    public static void main(String args[]) {

        String str;

        while(true){
            str = "Informe seu sexo com a letra inicial do mesmo";
            str = JOptionPane.showInputDialog(null,str);
            
            if(str == null){

                System.exit(0);
            }
            str = str.trim();
            if(str.length()==1){

                break;
            }
            str = "Sexo Informado: "+str;
            JOptionPane.showMessageDialog(null, str);

        }

       
    }
    
}