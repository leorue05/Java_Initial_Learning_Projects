import javax.swing.*;

public class MatrizIII {
    
    public static void main(String args[]) {

        int num = 0;

        while(num<=0){

            String cntts = "Numero de contatos";
            cntts = JOptionPane.showInputDialog(null, cntts);
            if(cntts==null||cntts.isEmpty()){System.exit(0);}
            
            num = Integer.parseInt(cntts);
        }
        
        String [][] lista = new String[num] [2];

        String str="";
        for(int i=0;i<lista.length;i++){
            while(true){
                str="Nome do "+(i+1)+"° contato:";
                str= JOptionPane.showInputDialog(null, str);
                if(str==null){break;}
                str = str.trim();
                if(str.length()>=2 && str.length()<=50){
                    lista [i] [0] = str;
                    break;
                }
            }

            if (str==null){System.out.println("Cancelado por não digitar nome algum");
                           break;}


                           while(true){
                            str="Email do "+(i+1)+"° contato:";
                            str= JOptionPane.showInputDialog(null, str);
                            if(str==null){break;}
                            str = str.trim();
                            if(str.length()>=5 && str.length()<=50){
                                lista [i] [1] = str;
                                break;
                            }
                        }
             
                        if (str==null){System.out.println("Cancelado por não digitar email algum");
                        break;}
        }//fim do for


        str = "Lista de contatos \n";
        for(int i=0; i<lista.length;i++){
            if(lista[i][1]==null){str+=" "+lista[i][0];break;}
            str+=" "+lista[i][0]+" - "+lista[i][1]+"\n";
            
            
        }

        JOptionPane.showMessageDialog(null, str);
    }

}
