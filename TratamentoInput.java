import java.util.*;

public class TratamentoInput {

    public static void main(String args[]){

        try{
        Scanner scnnr = new Scanner(System.in);
        System.out.println("Digite sua idade:\t");
        byte idade = scnnr.nextByte();
        if (idade<=0){
            System.out.println("A sua idade não pode ser negativa ou 0, insira sua idade correta!");
        }
        
        System.out.println("Você tem "+idade+"anos de idade");
        scnnr.close();
    }catch(InputMismatchException IME){}

    }
    
}
