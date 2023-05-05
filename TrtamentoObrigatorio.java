import java.io.*;

public class TrtamentoObrigatorio {
    
    public static void main(String args[]) {

        String txt = null;
        FileReader fr = null;
        try{
         fr = new FileReader("JACOBRITUAIS.txt");
    } catch (FileNotFoundException excpt){
        System.out.println(excpt.getMessage());

        System.out.println("Arquivo não encontrado");
        }
        BufferedReader br = new BufferedReader(fr);//isso fica fora do try pq precisa ser do escopo maior
    try{
        
        while(true){
            String linha = br.readLine();
            if(linha == null){
                break;
               
            }
            br.close();     fr.close();

            txt+=linha+"\n";
        }
    
    }catch(IOException excpt){System.out.println(excpt.getMessage());}

       
    System.out.println(txt);


}}