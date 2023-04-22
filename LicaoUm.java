import java.util.*;
import javax.swing.*;

public class LicaoUm{

public static void main(String args[]){

    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("\nInforme seu nome: \t");
        String nome = scan.nextLine();

        System.out.print("\nInforme seu sobrenome: \t");
        String sobrenome = scan.nextLine();

        System.out.println("\nDados Recebidos:");
        System.out.printf("Nome:\t Sobrenome:\n %s\t %s\n\n", nome, sobrenome);

        System.out.println();
        String idade = JOptionPane.showInputDialog(null,"Quantos anos você tem?");
        JOptionPane.showMessageDialog(null,"Nome: " +nome +"\nSobrenome: " +sobrenome +"\nIdade:" +idade);
                System.exit(0);

    }
    

}

/*

admito que peguei pedaços de progamas anteriores e só adaptei pra atender as condições, isso é valido?

*/

}
