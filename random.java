import java.io.*;
import java.util.*;

public class random{

    public static void main(String args[]) {

        PrintStream so = System.out;
        Random sla = new Random();

        so.println("NextBoolean():\t\t"+sla.nextBoolean());
        so.println("NextInt():\t\t"+sla.nextInt());
        so.println("NextInt(int bound):\t\t"+sla.nextInt(100));
        so.println("NextLong():\t\t"+sla.nextLong());
        so.println("NextFloat():\t\t"+sla.nextFloat());
        so.println("NextDouble():\t\t"+sla.nextDouble());
    
    }

}