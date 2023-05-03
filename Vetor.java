import java.io.*;

public class Vetor{

    public static void main(String args[]) {

        PrintStream so = System.out;

        int[] it = new int[3];
        it[0] = 65;
        it[0] = 66;
        it[2] = 67;

        so.println("\nConteúdo do vetor it: ");
        so.println("it[0]"+it[0]);
        so.println("it[1]"+it[1]);
        so.println("it[2]"+it[2]);
        so.println("tamanho do vetor"+it.length);
    }
}