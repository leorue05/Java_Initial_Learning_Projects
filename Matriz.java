public class Matriz {

    public static void main(String args[]) {

        int [] [] it = new int[2] [4];

        it[0] [0] = 0;
        it[0] [1] = 1;
        it[0] [2] = 2;
        it[0] [3] = 3;
        it[1] [0] = 4;
        it[1] [1] = 5;
        it[1] [2] = 6;
        it[1] [3] = 7;

        System.out.print(it[0][0]+" ");System.out.print(it[0][1]+" ");System.out.print(it[0][2]+" ");System.out.println(it[0][3]);
        System.out.print(it[1][0]+" ");System.out.print(it[1][1]+" ");System.out.print(it[1][2]+" ");System.out.println(it[1][3]);
        System.out.println(it.length+"x"+it[0].length);

        for(int i=0;i<it.length;i++){
            for(int j=0;j<it[i].length;j++){
                System.out.println("ch["+i+"]["+j+"] = "+it[i][j]+"\t \n");


    }
    
}

    }}
/* 
 
vetor = linha 0 1 2 3 4 5 6 (7 espaços)

matriz = Coluna0    Coluna1     Coluna2
linha   michel(0)    39 (01)         (02)
linha   alan  (10)   20 (11)         (12)

linha [0] [0] = michel;
linha [0] [1] = 39;

    

 */