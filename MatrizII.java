public class MatrizII{

    public static void main(String args[]){

        char [] [] ch = {{'A','B','C'},
                         {'a','b','c'},
                         {'1','2','3'}};
        System.out.println("\nConteúdo da Matriz ch:\n");
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch[i].length;j++){
                System.out.println("ch["+i+"]["+j+"] = "+ch[i][j]+"\t \n");

            }
        }
    }
}