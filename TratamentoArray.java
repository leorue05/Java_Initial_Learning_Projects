public class TratamentoArray {

    public static void main(String args[]) {

        String [] amgs = {"Alberto", "Bianca", "Caio", "Denise"};

        try{
        for(byte num = 0; num<=amgs.length;num++){

            System.out.println((num+1)+"° amigo: "+amgs[num]);
           
        }
            }catch(ArrayIndexOutOfBoundsException AIOUB){}
        
    }
    
}
/*
 Esse tipo de excção é checked ou unchecked?
 R: É do tipo unchecked de acordo com a documentação do java

Eu preciso usar try and catch para resolver a exceção desse código?
R:Não, como já evidenciado por códigos anteriores podemos resolver tal problema com
o seguinte método:
 if (num>2){System.exit(0);}

 */