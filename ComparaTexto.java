import java.io.*;
import java.util.*;

public class ComparaTexto {

    public static void main(String args[]) {

        PrintStream so  = System.out;
        Scanner Scnnr = new Scanner(System.in);

        so.print("\n Informe um texto:\t");
        String txt1 = Scnnr.nextLine();

        so.print("\n Informe um outro texto:\t");
        String txt2 = Scnnr.nextLine();

        so.println("\nComparacoes:");
        so.println(txt1+" e igual a "+txt2+" "+txt1.equals(txt2));      
        so.println(txt1+" e igual a "+txt2+" "+txt1.equalsIgnoreCase(txt2));
        so.println(txt1+" compare a "+txt2+" "+txt1.compareTo(txt2));
        so.println(txt1+" compare a "+txt2+" "+txt1.compareToIgnoreCase(txt2));


        Scnnr.close();

        /* o "IgnoreCase" ignora se tá em maiusculo ou minusculo */
    }
    
}