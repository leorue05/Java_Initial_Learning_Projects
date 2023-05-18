import javax.swing.*;

public class TesteAlerta extends TesteMensagem implements Alerta {

    public void exibir(String texto, int icone){
        JOptionPane.showMessageDialog(null, texto, "Atenção", icone);
    }
    public static void main (String args[]){
        TesteAlerta ta = new TesteAlerta();
        ta.exibir(ENTRADA);

        ta.exibir(FECHAR,2);
        ta.exibir(DEMORA,2);

        try{
            Thread.sleep(3000);
        }catch(Exception ex){}
        ta.exibir(SUCESSO);
    }

}
