import java.io.*;
import java.util.*;

public class Licao3 {
    
    public static void main(String args[]) {

        PrintStream so = System.out;
        Scanner Scnnr = new Scanner(System.in);

        //1
        so.print("Digite seu nome completo:\t");
        String nome = Scnnr.nextLine();

        //2
        so.println("Quantidade de caracteres:\t"+nome.replace(" ","").length());

        //3
        so.println("Primeiro nome em maiuscula e segundo nome em minuscula:\t"+nome.substring(0, nome.indexOf(" ")).toUpperCase()+(" ")+nome.substring(nome.indexOf(" ")+1,nome.lastIndexOf(" ")).toLowerCase());
        
        //4
        String PL = String.valueOf(nome.charAt(0));
        String UL = nome.substring(nome.length()-1);
        so.println("trocando a primeira e ultima letra de lugar:\t"+nome.replace(PL,UL)+"\t"+nome.replace(UL,PL));
        
        //5
        String PN = nome.substring(0, nome.indexOf(" "));
        String UN = nome.substring(nome.lastIndexOf(" ")+1,nome.length());
        so.println("Comparando o primeiro e ultimo nome para ver se são iguais:\t"+PN.compareToIgnoreCase(UN));
        
        //6
        String SCdoPN =String.valueOf(nome.charAt(1));
        so.println(SCdoPN+", e seu valor unicode eh:\t"+0xFFFF);
        
        //7
        String TCdoPN =String.valueOf(nome.charAt(2));
        char TCdoPN1 =  TCdoPN.charAt(0);
        so.println("O caractere '"+TCdoPN+"' eh um numero?:\t"+Character.isDigit(TCdoPN1));
        
        //8
        String PCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+1));
        char PCdoSN1 =  PCdoSN.charAt(0);
        so.println("O caractere '"+PCdoSN1+"' eh uma letra?:\t"+Character.isLetter(PCdoSN1));
        
        //9
        String SCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+2));
        char SCdoSN1 =  SCdoSN.charAt(0);
        so.println("O caractere '"+SCdoSN1+"' eh uma letra ou um digito?:\t"+Character.isLetterOrDigit(SCdoSN1));
        
        //10
        String TCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+3));
        char TCdoSN1 =  TCdoSN.charAt(0);
        so.println("O caractere '"+TCdoSN1+"' eh um espaço em branco?:\t"+Character.isWhitespace(TCdoSN1));
        
        //11
        Random rndm = new Random();
        int qntdchar = nome.replace(" ","").length();
        int posNomeAleatorio = rndm.nextInt(qntdchar);
        so.println("Numero aleatório que corresponde a posição de alguma letra:\t"+posNomeAleatorio);
        
        //12
        char letraAleatorio =  nome.replace(" ","").charAt(posNomeAleatorio);
        so.println("alguma letra:\t"+letraAleatorio);
        
        //13
        so.println("O caractere'"+letraAleatorio+"'eh minusculo?:\t"+Character.isLowerCase(letraAleatorio));
        
        //14
        so.println("O caractere'"+letraAleatorio+"'eh maiusculo?:\t"+Character.isUpperCase(letraAleatorio));

        //15
        int qntdchar1 = nome.replace(" ","").length();
        int posNomeAleatorio1 = rndm.nextInt(qntdchar1);
        char letraAleatorio1 =  nome.replace(" ","").charAt(posNomeAleatorio1);

        //16
        so.println("O caractere'"+letraAleatorio1+"'em minusculo:\t"+Character.toLowerCase(letraAleatorio1));

        //17
        int qntdchar2 = nome.replace(" ","").length();
        int posNomeAleatorio2 = rndm.nextInt(qntdchar2);
        char letraAleatorio2 =  nome.replace(" ","").charAt(posNomeAleatorio2);

        //18
        so.println("O caractere'"+letraAleatorio2+"'em maiusculo:\t"+Character.toUpperCase(letraAleatorio2));

        //20
        so.println("Esta eh a primeia aparição do caractere '"+letraAleatorio1+"'':\t"+nome.indexOf(letraAleatorio1));

        //21
        so.println("Esta eh a ultima aparição do caractere '"+letraAleatorio2+"'':\t"+nome.lastIndexOf(letraAleatorio2));


        Scnnr.close();


    }


}