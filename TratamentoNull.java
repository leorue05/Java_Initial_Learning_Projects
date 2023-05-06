import javax.swing.*;

public class TratamentoNull {

    public static void main(String args[]) {

        try{
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        nome = nome.toUpperCase();
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome);

    
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Digite um nome","Aviso",1);
        }
    }
    
}
/* 
Esse tipo de excção é checked ou unchecked?
R: É do tipo unchecked de acordo com a documentação do java

Eu preciso usar try and catch para resolver a exceção desse código?
R:Não, como já evidenciado por códigos anteriores podemos resolver tal problema com
o seguinte método:
if(nome==null){System.exit(0);}

 */