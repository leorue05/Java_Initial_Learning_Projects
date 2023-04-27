import javax.swing.*;

public class EstruturaIfElse {
    
    public static void main(String args[]) {

        double nota1=0, nota2=0, nota3=0, media;

        String st = "Informe sua primeira nota(de 0  a 10): ";
        st = JOptionPane.showInputDialog(null, st);
        
        if (st==null || st.trim().length()==0){

            st = "INFORME SUA NOTA, por favor,!!!!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }else{

            nota1 = Double.parseDouble(st);
        }


        st = "Informe sua segunda nota(de 0  a 10): ";
        st = JOptionPane.showInputDialog(null, st);
        
        if (st==null || st.trim().length()==0){

            st = "INFORME SUA NOTA, por favor,!!!!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }else{

            nota2 = Double.parseDouble(st);
        }


        st = "Informe sua terceira nota(de 0  a 10): ";
        st = JOptionPane.showInputDialog(null, st);
        
        if (st==null || st.trim().length()==0){

            st = "INFORME SUA NOTA, por favor,!!!!";
            JOptionPane.showMessageDialog(null, st, "Erro", 0);
            System.exit(0);
        }else{

            nota3 = Double.parseDouble(st);
        }

        media = (nota1+nota2+nota3)/3;

        if(media>=5){
            if(media<6){
                st = "Passou raspando com esse"+media;
            }else if(media<=8.5){
                st = "Passou suave com"+media;

            }else if (media>8.5){
                st ="Genio, ficou com"+media+"de media!!!";
            }



        }else{
            if(media>=3){
                st = "com sorte, da pra passar na recuperacao ou conselho, pq"+media+"eh complicado";
            
            }else{
                st = media+"?????, tirei meio ponto a mais, mtt burro kkkkkkkkkkkk1";
            }


        }

        JOptionPane.showMessageDialog(null, st, "Mensagem", 1);
        System.exit(0);
        
    }

}
