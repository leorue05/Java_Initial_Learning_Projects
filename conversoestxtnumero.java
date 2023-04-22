public class conversoestxtnumero {
    
    public static void main(String args[]){

        String numByte = "33";
        String numShort = "23334";
        String numInt = "2435424";
        String numLong = "725362462";
        String numFloat = "3.6563";
        String numDouble = "4.224";

        byte b = Byte.parseByte (numByte);
        short s = Short.parseShort (numShort);
        int i = Integer.parseInt (numInt);
        long l = Long.parseLong(numLong);
        float f = Float.parseFloat(numFloat);
        double d = Double.parseDouble(numDouble);

        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println(i);
        System.out.println();
        System.out.println(l)
        ;System.out.println();
        System.out.println(f);
        System.out.println();
        System.out.println(d);
        System.out.println();
       

        
    }
}
