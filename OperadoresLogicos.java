import java.io.*;
import java.util.*;

public class OperadoresLogicos {
    
    public static void main(String args[]){

        PrintStream so = System.out;
        Scanner scnnr = new Scanner(System.in);

        so.println("\nDigite true ou false:\t");
        boolean b1 = scnnr.nextBoolean();

        so.println("\nDigite true ou false:\t");
        boolean b2 = scnnr.nextBoolean();

        so.println("\nOperacoes Logicas:");
        so.println(b1+" || "+b2+" = "+(b1||b2));
        so.println(b1+" && "+b2+" = "+(b1&&b2));
        so.println(b1+" ^ "+b2+" = "+(b1^b2));
        so.println("!"+b1+":\t\t"+!b1);
        so.println("!"+b2+":\t\t"+!b2);

        so.println("\nAtribuicoes:");
        so.println(b1+" |= "+b2+":\t"+(b1|=b2));
        so.println(b1+" &= "+b2+":\t"+(b1&=b2));
        so.println(b1+" ^= "+b2+":\t"+(b1^=b2));
        
        scnnr.close();


    }

}
/*
 || (ou lógico) se houver true na comparação, o resultado será true
 && (e lógico) se houver false na comparação, o resultado será false
 ^  (XOR logico/ou exclusivo) compara se são diferem(true) ou iguais(false)

 ! not unário lógico, ele inverte o valor booleano

 |= Atribuição de OR
 &= Atribuição de AND
 ^= Atribuição de XOR

                valores booleanos iguais        valores booleanos diferentes

|=          IGUAL(retorna o valor colocado)         TRUE
&=          IGUAL(retorna o valor colocado)         FALSE
^=          FALSE                                   TRUE

 */