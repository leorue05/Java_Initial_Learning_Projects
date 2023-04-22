import java.util.*;

public class conversaocaractere {
    
    public static void main(String args[]) {

        char c = '4';
        int i = c;

        System.out.println();
        System.out.println(i);

        int i1 = 65;
        char c1 = (char) i1;

        System.out.println();
        System.out.println(c1);

            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Digite um número pertencente ao conjunto dos inteiros:\t");
                String texto = scan.nextLine();

                int num = Integer.parseInt(texto);
                char c2 = (char) num;

                System.out.println();
                System.out.println(num+"  correspoonde a  "+ c2);
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        


    }
}
/*

o que ocorre é que o código HTML do caractere inserido na variável "c" é um valor numérico

int=>char não precisa de conversão, de novo principio das ciaxas que contem cada elemento,
char=>int precisa de conversão

 */