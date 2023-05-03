import javax.swing.*;

public class VetorIII {

    public static void main(String args[]) {

        String[] cnvdds = new String[20];

        for (int num=0;num<cnvdds.length;num++){

            String str = "Nome do convidado "+num;
            str = JOptionPane.showInputDialog(null, str);

            if(str==null){break;}

            str = str.trim();
            cnvdds[num]=str;
        }
        
        String msg = "Relação de convidados: ";
        for(int pos=0;pos<cnvdds.length;pos++){

            if(cnvdds[pos]==null){break;}

        msg += "\n- "+cnvdds[pos];

        }

        JOptionPane.showMessageDialog(null, msg);

    }
    
}
