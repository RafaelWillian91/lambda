package InterfacesFuncionaisMaisUsadas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class PredicateApp {

    public static void main(String[] args) {

        //Interface Funcional Predicate recebe uma Paremetrizacao e retorna um booleano
        var list = List.of("A", "B", "C", "D", "E", "FD", "RA", "LK");

        var myListReturn = testAdd(list, d -> d.length() == 1);
        System.out.println(myListReturn);
    }


    private static List<String> testAdd(List<String> myList, Predicate<String> testPredicate){

        List list2 = new ArrayList();

        for (String string: myList
             ) {
            if(testPredicate.test(string)){
                list2.add(string);
            }
        }
        return list2;

    }

}
