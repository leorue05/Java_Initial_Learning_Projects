import javax.swing.*;

public class ValidaiNTEIRO {

    public static void main(String args[]) {

    String str;
    int num = 0;

    while(num<1||num>10){

        str = "Informe um número inteiro ";
        str = JOptionPane.showInputDialog(null, str);

       //  if(str==null||str.isEmpty()){System.exit(0);}

       try{
       

        num = Integer.parseInt(str);

        if(num<1){
            str = "O número deve ser maior que 0!";
            //JOptionPane.showMessageDialog(null, str,"Erro!",0);
            throw new IllegalArgumentException(str);
        }
        else if(num>10){
            str = "O número deve ser menor que 11!";
            //JOptionPane.showMessageDialog(null, str,"Erro!",0);
            throw new IllegalArgumentException(str);
        }
    }catch(NumberFormatException e){
        str=" Digite um numero entre 0 e 10\n Tipo: "+e.getClass()+"\nMensagem :"+e.getMessage();
        JOptionPane.showMessageDialog(null, str,"Erro!",0);}
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage()+e.getClass(), "Erro!", 0);
        }

    
    }
    

    JOptionPane.showMessageDialog(null, "Número valido: "+num);
    
}
}

