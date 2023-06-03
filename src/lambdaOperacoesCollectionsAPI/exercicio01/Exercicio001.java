package lambdaOperacoesCollectionsAPI.exercicio01;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Exercicio001 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,6,1,9,5,8,7));

        //Adicionando 2 em cada numero com unaryOperator
        numbers.replaceAll(n -> n+2);
        System.out.println(numbers);

        //removendo um numero com Predicate
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);

        //inverto as posicoes com Comparator
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        //Consumindo a lista com Consumer
        numbers.forEach(System.out::print);

    }


}
