import java.io.*;

public class charactere {

    public static void main(String args[]) {

        PrintStream so = System.out;

        so.println("");
        so.println("\nCodigo de carctere");
        so.println("A:\t"+Character.getNumericValue('S'));
        so.println("\nTestes diversso:\n");

        Character n=9;
        Character t = 'Z';
        int i = 69;
        Character l = 'X';

        so.println("9 eh um digito?\t\t"+Character.isDigit(n));
        so.println("69 no valor unicode eh um digito?\t\t"+Character.isAlphabetic(i));
        so.println("9 eh uma letra?\t\t"+Character.isLetter(n));
        so.println("Z eh uma letra?\t\t"+Character.isLetter(t));
        so.println("9 eh uma letra ou digito?\t\t"+Character.isLetterOrDigit(n));
        so.println("9 eh um espaço em branco?\t\t"+Character.isWhitespace(n));

        so.println("Z eh uma letra maiuscula?\t\t"+Character.isUpperCase(t));
        so.println("Z eh uma letra minuscula?\t\t"+Character.isLowerCase(t));

        so.println("Converter X para maiuscula:\t"+Character.toUpperCase(l));
        so.println("Converter X para minuscula:\t"+Character.toLowerCase(l));





        
    }
    
}
