import java.io.*;
import java.util.*;

public class matematica {
    
    public static void main(String args[]) {

        PrintStream so = System.out;
        Scanner Scnnr = new Scanner(System.in);

        so.println();
        so.println("Valor de E:\t"+Math.E);
        so.println("Valor de pi:\t"+Math.PI);
        so.println("\nNumero aleatorio:\t"+Math.random());
        so.println("Digite um número base para os exemplos a seguir:\t");
        String num = Scnnr.nextLine();
        double num1 = Double.parseDouble(num);
        so.println("raiz quadrada:\t"+Math.sqrt(num1));
        so.println("elevado ao quadrado:\t"+Math.pow(num1,2));
        so.println("proximo inteiro:\t"+Math.ceil(num1));
        so.println("inteiro anterior:\t"+Math.floor(num1));
        so.println("arredondamentos:\t");
        so.println("Com rint():\t"+Math.rint(4.445356));
        so.println("Com round():\t"+Math.round(4.445356));
        so.println("Com rint():\t"+Math.rint(4.5000000));
        so.println("Com round():\t"+Math.round(4.50000000000));
        so.println("Com rint():\t"+Math.rint(4.865356));
        so.println("Com round():\t"+Math.round(4.865356));


        Scnnr.close();
        
    }

}
