import javax.swing.*;

public class TesteMensagem implements Mensagem{

    public void exibir(String texto){
        JOptionPane.showMessageDialog(null, texto, "Mensagem", 1);
    }
    
    public static void main(String args) {
        
        TesteMensagem tm = new TesteMensagem();
        String str = Mensagem.ENTRADA;
        tm.exibir(str);

        str = TesteMensagem.SUCESSO;
        tm.exibir(str);

    }

}
