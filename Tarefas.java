import javax.swing.*;

public class Tarefas {
    
    public static void main(String args[]) {

        String tarefas = "Lista de tarefas";

        for(int num = 1 ;num <= 10; num++){

            String str = "Tarefa numero"+num;
            str = JOptionPane.showInputDialog(null, str);

            if (str == null){
                break;
            }
            
            str = str.trim();
            tarefas+="\n Tarefa"+num+": "+str;
        
        }

        JOptionPane.showMessageDialog(null, tarefas);
        
        }

    }
