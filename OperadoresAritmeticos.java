import java.io.*;
import java.util.*;

public class OperadoresAritmeticos {

    public static void main(String args[]){

        PrintStream so = System.out;
        Scanner scnnr = new Scanner(System.in);

        so.println("\nInforme um numero:\t");
        double n1 = scnnr.nextDouble();

        so.println("\nInforme um outro numero:\t");
        double n2 = scnnr.nextDouble();

        double vt = 3;

        so.println("\nOperacoes Aritimeticas Basicas:");
        so.println("Soma:\t"+n1+" + "+n2+" = "+(n1+n2));
        so.println("Subtração:\t"+n1+" - "+n2+" = "+(n1-n2));
        so.println("Multiplicação:\t"+n1+" * "+n2+" = "+(n1*n2));
        so.println("Divisão:\t"+n1+" / "+n2+" = "+(n1/n2));
        so.println("Modulo:\t"+n1+" % "+n2+" = "+(n1%n2));//resto da divisão

        so.println("\nIncrememnto e Decremento:(+e- 1 em cada um)");
        so.println("\nIncremento:\t"+(++n1));
        so.println("\nDecremento:\t"+(--n2));

        so.println("\nIncremento:\t"+(n1++));
        so.println("\nIncremento:\t"+(n2--));
        so.println(n1+" "+n2);

        so.println("\nOperacoes e Atribuicoes:");
        so.println("Aditiva (vt +=2)\t:"+(vt+=2));//vt = vt+2
        so.println("Subtrativa (vt -=2)\t:"+(vt-=2));
        so.println("Multiplicativa (vt *=2)\t:"+(vt*=2));
        so.println("Divisiva (vt /=2)\t:"+(vt/=2));
        so.println("Modulativa (vt %=2)\t:"+(vt%=2));


       scnnr.close();
    }
    
}
