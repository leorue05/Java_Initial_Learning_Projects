import javax.swing.*;

public class VetorIV {

    public static void main(String args[]) {

        int n = 0;
        while(n<=0){

            String str = "Núemro de amigos";
            str = JOptionPane.showInputDialog(null, str);
            if(str==null || str.isEmpty()){
                System.exit(0);
            }
            n = Integer.parseInt(str);
        }

            String[] amgs = new String[n];
    
            for (int num=0;num<amgs.length;num++){
    
                String str = "Nome do amigo "+num;
                str = JOptionPane.showInputDialog(null, str);
    
                if(str==null){break;}
    
                str = str.trim();
                amgs[num]=str;
            }
            
            String msg = "Relação de amigos: ";
            for(int pos=0;pos<amgs.length;pos++){
    
                if(amgs[pos]==null){break;}
    
            msg += "\n- "+amgs[pos];
    
            }
    
            JOptionPane.showMessageDialog(null, msg);
    
        
    }
    
}
