package UsandoMethodReferencesParte2;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        //Quando existe apenas um paremetro o parentes e opcional
        transformAndPrint(i -> String.valueOf(i), new Scanner(System.in).nextInt());

        //Temos uma linha, uma parâmetro (i) e o parametro é aplicado ao método static de String. Temos um candidado ao Method Reference
        //O java sabe que o método valueOf deve receber um parâmetro, ele aplica no método valueOf a expressao que vai ser usada (i)
        transformAndPrint(String::valueOf, 20);
    }

    private static void transformAndPrint(NumberTransformer numberTransformer, int number){
        System.out.println(numberTransformer.transform(number));
    }


}
