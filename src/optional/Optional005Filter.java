package optional;

import java.util.Map;
import java.util.Optional;

public class Optional005Filter {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));

        //Filter é um metodo em Optional que recebe um Predicate para um teste lógico antes do retorno
        //Podendo usar chamadas encadeadas depois dele conforme o exemplo.
       p.getNameByID(1).filter(n -> n.startsWith("R")).ifPresentOrElse(System.out::println, () -> System.out.println("Não há elementos" +
                "com a letra informada"));


    }
}
