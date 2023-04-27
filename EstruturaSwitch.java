import javax.swing.*;

public class EstruturaSwitch {

    public static void main(String args[]) {

        String st = "Informe um numero entre 1 e 12";
        st = JOptionPane.showInputDialog(null,st);
        if (st !="1" || st !="2" || st !="3" || st !="4" 
        || st !="5" || st !="6" || st !="7" || st !="8" 
        || st !="9" || st !="10" || st !="11" || st !="12"){

            st = "0";

        }
       
        byte mes = Byte.parseByte(st);
        
        switch(mes){
            case 1:
            st="Janeiro";
            break;
            case 2:
            st="Fevereiro";
            break;
            case 3:
            st="Março";
            break;
            case 4:
            st="Abril";
            break;
            case 5:
            st="Maio";
            break;
            case 6:
            st="Junho";
            break;
            case 7:
            st="Julho";
            break;
            case 8:
            st="Agosto";
            break;
            case 9:
            st="Setembro";
            break;
            case 10:
            st="Outubro";
            break;
            case 11:
            st="Novembro";
            break;
            case 12:
            st="Dezembro";
            break;
            default:
                st ="Isso não é um mês";
                JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
                System.exit(0);
        }//isso termina o switch

        st="Voce escolheu o mês de "+st;
        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
        
    }
    
}
/*
 eu to ligado que o if monstruoso é horrendo, mas são 2:45 da manhã, eu vou dormir
 */