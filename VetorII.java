import java.util.*;
import javax.swing.*;

public class VetorII {

    public static void main(String args[]) {

        char[] ch = new char[]{
            'p','i','z','z','a',
            'd','e','p','e','p',
            'e','r','o','n','i',
            '0','1','2','3','4'
        };

        String codigo ="";
        Random sla = new Random();

        for(int i=1;i<25;i++){
            codigo+=ch[sla.nextInt(20)]+" ";

            if(i%8 == 0){
                codigo+="\n";
            }
        }
   JOptionPane.showMessageDialog(null, codigo);
   
    }


    
}
