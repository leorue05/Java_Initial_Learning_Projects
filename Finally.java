import javax.swing.*;

public class Finally {

    public static void main(String args[]) {

        String str = "Informe um número";
        str = JOptionPane.showInputDialog(null, str);
        
        if (str==null||str.isEmpty()){System.exit(0);}

        try{

            int num = Integer.parseInt(str);
            JOptionPane.showMessageDialog(null, "Numero Valido !"+num);



        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números!!","Erro",0);

        }finally{
            JOptionPane.showMessageDialog(null, "Operação Encerrada!");
            System.exit(0);
        }
    }
    
}
