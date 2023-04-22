import java.util.*;

public class LicaoDois {

    public static void main(String args[]){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nInforme seu nome: \t");
            String nome = scan.nextLine();
    
            System.out.print("\nQual sua idade? \t");
            String idade = scan.nextLine();

            System.out.print("\nQual o seu salário? \t");
            String salario = scan.nextLine();

            float Salario = Float.parseFloat(salario);
            int SALARIO = (int) Salario;


            System.out.println();
            System.out.printf("Nome:\t\t %s \nSobrenome:\t %s \nSalario:\t %s", nome, idade, SALARIO);
    
}
    }

}