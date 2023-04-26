import java.io.*;
import java.util.*;

public class OperadoresRelacionais {
    
    public static void main(String args[]) {

        PrintStream so = System.out;
        Scanner scnnr = new Scanner(System.in);

        so.println("\nInforme um numero inteiro:\t");
        int n1 = scnnr.nextInt();

        so.println("\nInforme um numero inteiro:\t");
        int n2 = scnnr.nextInt();

        so.println("\nComparacoes:");
        so.println(n1+" eh igual a "+n2+"?:\t\t"+(n1==n2));
        so.println(n1+" eh diferente de "+n2+"?:\t"+(n1!=n2));
        so.println(n1+" eh maior que "+n2+"?:\t"+(n1>n2));
        so.println(n1+" eh menor que "+n2+"?:\t"+(n1<n2));
        so.println(n1+" eh maior ou igual a "+n2+"?:\t"+(n1>=n2));
        so.println(n1+" eh menor ou igual a "+n2+"?:\t"+(n1<=n2));

        scnnr.close();
    
    }

}

