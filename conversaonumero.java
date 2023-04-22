public class conversaonumero {

    public static void main(String args[]){

        byte j = 122;
        short k = j;

        System.out.println();
        System.out.println(j);
        System.out.println(k);
        System.out.println();

        short l = 32;
        byte m = (byte) l;
        //com a notação da variavel entre parenteses é posível converter de uma váriavel
        //"maior" para uma "menor",contanto que o valor da maior seja posível na menor

        System.out.println();
        System.out.println(l);
        System.out.println(m);
        System.out.println();

        short n = 200;
        byte o = (byte) n;
        //como 200 não é posível em byte, acontece um "processo de ajuste circular"
        //o valor será convertido para uma váriável que não o suporta
        //essencialmente dando "voltas" nos valores aceitos até encontrar um equivalente na "ordem"

        System.out.println();
        System.out.println(n);
        System.out.println(o);
        System.out.println();

        long p = 2147483647;
        long q = 2147483648l;
        //como por padrão qualquer variavel numerica inteira é int, para sinalizar o contrario deve-se adicionar
        //a primeira letra do nome de uma variável fora de int para designala como tal

        System.out.println();
        System.out.println(p);
        System.out.println(q);
        System.out.println();



    }

}

/* 

(por padrão o java trata todas variáveis numericas como int)

//como por padrão qualquer variavel numerica inteira é int, para sinalizar o contrario deve-se adicionar
//a primeira letra do nome de uma variável fora de int para designala como tal
e como qualquer valor decimal é tratado como double dev-se fazer o mesmo procedimento para modificar isso
(o java converte por trás mas se necessário deve-se fazer o acima)

NUMEROS => byte->short->int->long->float->double

                DE FORMA AUTOMÁTICA
as setas indicam "pode-se converter para tal", pois cada variável está "contida" 
(de forma semelhante aos conjuntos numéricos) dentro da outra
portanto da mesma forma que 5 está em R porém -5 está em R-N
um byte está em long, mas um long não pode estar em byte

 */