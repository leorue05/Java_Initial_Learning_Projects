import java.io.*;

public class entrada {
    
    public static void main(String args[]) throws IOException{

        System.out.println();
        System.out.print("\n Informe seu nome: ");
        byte[] bt = new byte[2];
        System.in.read(bt);
        String nome = new String(bt).trim();
        System.out.printf(" Seja bem-viado! %s", nome);
        System.out.println();
        System.out.println();

}
}