import java.io.*;
import java.util.*;

public class AnalizadorDeTexto {

    public static void main(String args[]) {

        PrintStream saida = System.out;

        Scanner scan = new Scanner (System.in);
        saida.print("\n Digite seu nome completo:\t");
        String nome = scan.nextLine();

        saida.println("\nAnalise do nome:\t\t"+nome);

        saida.print("Conversao para maiuscula:\t");
        saida.println(nome.toUpperCase());

        saida.print("Conversao para minuscula:\t");
        saida.println(nome.toLowerCase());

        saida.print("substituindo o espaco por '_':\t");
        saida.println(nome.replaceAll(" ","_"));

        saida.print("Quantidade de caracteres:\t");
        saida.println(nome.length());

        saida.print("A primeira letra:\t\t");
        saida.println(nome.charAt(0));

        saida.print("Posicao da primeira letra 'a': \t");
        saida.println(nome.indexOf("a"));

        saida.print("Posicao da ultima letra 'a':\t");
        saida.println(nome.lastIndexOf("a"));

        saida.print("O primeiro nome:\t");
        saida.println(nome.substring(0, nome.indexOf(" ")));

        saida.print("O ultimo nome:\t");
        saida.println(nome.substring(nome.lastIndexOf(" ")+1, nome.length()));


        scan.close();

    }
    
}
