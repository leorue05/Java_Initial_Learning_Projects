import java.util.*;

public class entradascanner {
    
    public static void main(String args[]){

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nInforme seu nome: \t");
            String nome = scan.nextLine();

            System.out.print("\nInforme seu sobrenome: \t");
            String email = scan.nextLine();

            System.out.println("\nDados Recebidos:");
            System.out.printf("Nome:\t %s \nE-mail:\t %s\n\n", nome, email);
        }

    }

}
