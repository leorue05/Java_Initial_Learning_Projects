import javax.swing.*;

public class MatrizIV {
    
    public static void main(String args[]) {

        int numAlns = 0;

        while(numAlns<=0){

            String str = "Número de alunos";
            str = JOptionPane.showInputDialog(null, str);
            if(str==null||str.isEmpty()){System.exit(0);}
            numAlns = Integer.parseInt(str);
        }

        int numNotas = 0;

        while(numNotas<=0){

            String str = "Número de notas";
            str = JOptionPane.showInputDialog(null, str);
            if(str==null||str.isEmpty()){System.exit(0);}
            numNotas = Integer.parseInt(str);
        
         }

         double[][] notas = new double[numAlns][numNotas];

         String str="";
         for(int linha=0;linha<notas.length;linha++){
            for(int coluna=0;coluna<notas[linha].length;coluna++){

                while(true){
					str = (linha+1)+" ° aluno "+(coluna+1)+"° nota :";
					str = JOptionPane.showInputDialog(null, str);
					
					if(str==null || str.isEmpty()){
						break;
					}
					
					double n = Double.parseDouble(str);
					if(n>=0 && n<=10){
						notas[linha][coluna]=n;
						break;
					}					
				}//fim do while
				
				if(str==null){
					break;
				}
			}//fim do for coluna
			
			if(str==null){
				break;
			}
		}//fim do for linha
         str="Quadro de notas:";
         for(int linha=0; linha<notas.length;linha++){
           double soma =0;
           str+="\n"+(linha+1)+"° Aluno: ";
           for(int coluna=0;coluna<notas[linha].length;coluna++){
            soma += notas[linha][coluna];
            str += notas[linha][coluna]+" ";
           }

           str+=" media: "+(soma/numNotas);
        }

       

        JOptionPane.showMessageDialog(null, str);


    }//fim

}//fim ABSOLUTO




//nice2