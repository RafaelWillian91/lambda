package optional;

import java.util.Map;

public class Optional006Map {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));

        //o método mao recebe uma Functional que recebe um tipo e retorna outro tipo ou o mesmo.
        //senao retorna 0, o Optional nos ajuda a fugir das nullpointerException
        var lenghtString = p.getNameByID(2).map(String::length).orElse(0);

        System.out.println(lenghtString);

    }
}
