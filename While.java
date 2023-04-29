public class While {

    public static void main(String args[]) {

        System.out.println("\nPrimeiro while:");

        int n = 1;

        while(n<=10){

            System.out.println(++n);


        }
        System.out.println("\nSegundo while:");

        n = 69;

        while(n>=65){

            String st = "O número "+n+" equivale ao caractere ";
            st += (char) n;
            System.out.println(st);
            n--;
        
    }
    
}
}