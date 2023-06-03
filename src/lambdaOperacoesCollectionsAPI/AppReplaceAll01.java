package lambdaOperacoesCollectionsAPI;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class AppReplaceAll01 {

    public static void main(String[] args) {

        var numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //replaceAll recebe um UnaryOperator extende Function mais passando um tipo x e retornando o mesmo tipo x
        //é uma especializacao de Functional
        numbers.replaceAll(n -> n*2);
        System.out.print(numbers);



    }
}
