import javax.swing.*;

public class EstruturaIf{

    public static void main(String args[]) {

        String st = "Informe seu nome: ";
        st = JOptionPane.showInputDialog(null, st);

        System.out.println("st: "+st);
        System.out.println("st tamanho: "+st.length());

        if(st==null){

            System.exit(0);
        }
        if(st.length()==0){
            System.exit(0);

        }
        st = "Nome informado: "+st;
        JOptionPane.showInputDialog(null, st,"Mensagem", 1);
        System.exit(0);


    }
}