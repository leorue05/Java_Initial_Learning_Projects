import java.io.*;
import java.util.*;

public class Licao3 {
    
    public static void main(String args[]) {

        PrintStream so = System.out;
        Scanner Scnnr = new Scanner(System.in);

        so.print("Digite seu nome completo:\t");
        String nome = Scnnr.nextLine();

        so.println("Quantidade de caracteres:\t"+nome.replace(" ","").length());

        so.println("Primeiro nome em maiuscula e segundo nome em minuscula:\t"+nome.substring(0, nome.indexOf(" ")).toUpperCase()+(" ")+nome.substring(nome.indexOf(" ")+1,nome.lastIndexOf(" ")).toLowerCase());

        String PL = String.valueOf(nome.charAt(0));
        String UL = nome.substring(nome.length()-1);
        so.println("trocando a primeira e ultima letra de lugar:\t"+nome.replace(PL,UL)+"\t"+nome.replace(UL,PL));
        
        String PN = nome.substring(0, nome.indexOf(" "));
        String UN = nome.substring(nome.lastIndexOf(" ")+1,nome.length());
        so.println("Comparando o primeiro e ultimo nome para ver se são iguais:\t"+PN.compareToIgnoreCase(UN));
        
        String SCdoPN =String.valueOf(nome.charAt(1));
        so.println(SCdoPN+", e seu valor unicode eh:\t"+0xFFFF);

        String TCdoPN =String.valueOf(nome.charAt(2));
        char TCdoPN1 =  TCdoPN.charAt(0);
        so.println("O caractere '"+TCdoPN+"' eh um numero?:\t"+Character.isDigit(TCdoPN1));

        String PCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+1));
        char PCdoSN1 =  PCdoSN.charAt(0);
        so.println("O caractere '"+PCdoSN1+"' eh uma letra?:\t"+Character.isLetter(PCdoSN1));

        String SCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+2));
        char SCdoSN1 =  SCdoSN.charAt(0);
        so.println("O caractere '"+SCdoSN1+"' eh uma letra ou um digito?:\t"+Character.isLetterOrDigit(SCdoSN1));

        String TCdoSN =String.valueOf(nome.charAt(nome.indexOf(" ")+3));
        char TCdoSN1 =  TCdoSN.charAt(0);
        so.println("O caractere '"+TCdoSN1+"' eh um espaço em branco?:\t"+Character.isWhitespace(TCdoSN1));

        Random rndm = new Random();
        int qntdchar = nome.replace(" ","").length();
        int posNomeAleatorio = rndm.nextInt(qntdchar);
        so.println("Numero aleatório que corresponde a posição de alguma letra:\t"+posNomeAleatorio);

        char letraAleatorio =  nome.charAt(posNomeAleatorio);
        so.println("'Alguma letra':\t"+letraAleatorio);





        
        Scnnr.close();
    }

}
