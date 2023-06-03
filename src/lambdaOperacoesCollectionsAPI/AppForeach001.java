package lambdaOperacoesCollectionsAPI;

import InterfacesFuncionaisMaisUsadas.Consumer;

import java.util.List;

public class AppForeach001 {

    public static void main(String[] args) {

        var numbers = List.of(1,2,3,4,5,6,7,8,9);

//        for(int n: numbers){
//            System.out.println(n);
//        }

        numbers.forEach(n -> System.out.println(n));

        //Usando method Reference para interar sobre uma lista.
        numbers.forEach(System.out::println);

    }
}