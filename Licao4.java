import java.io.*;
import java.util.*;

public class Licao4 {
    
    public static void main(String args[]) {

        PrintStream so = System.out;
        Random sla = new Random();
        
        //1
        int num = sla.nextInt(1,100);
        so.println("Numero aleatorio de 1 a 100:\t\t"+num);

        //2
        double numsqrtd = Math.sqrt(num);
        so.println("Raiz quadrada de tal numero:\t"+numsqrtd);

        //3
        int num1 = sla.nextInt(1,10);
        double numpwrd = Math.pow(num, num1);
        so.println("Tal numero elevado a um numero aleatorio:\t"+numpwrd);

        //4
        so.println("proximo inteiro:\t"+Math.ceil(numsqrtd));
        so.println("inteiro anterior:\t"+Math.floor(numsqrtd));
        so.println("Com rint():\t"+Math.rint(numsqrtd));
        so.println("Com round():\t"+Math.round(numsqrtd));

        so.println("\nCom next");
        so.println("NexBoolean:\t\t" + sla.nextBoolean() );
        so.println("next int:\t\t" + sla.nextInt() );
        so.println("next int (com bound):\t" + sla.nextInt() );
        so.println("next long:\t\t" + sla.nextLong() );
        so.println("next Float:\t\t" + sla.nextFloat() );
        so.println("next Double:\t\t" + sla.nextDouble() );
    

}
}