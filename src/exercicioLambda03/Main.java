package exercicioLambda03;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(filter(numbers, (num -> (num % 2 == 0))));

        System.out.println(filter(numbers, (num -> num >= 5)));

    }

    private static List<Integer> filter(List<Integer> numbers, Condition condition){
        List <Integer> newList = new ArrayList<>();

        for (int a: numbers) {
            if(condition.condicao(a)) {
                newList.add(a);
            }
        }

        return newList;
    }
}

@FunctionalInterface
 interface Condition {
     boolean condicao(int num);

}
