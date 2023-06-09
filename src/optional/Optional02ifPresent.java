package optional;

import java.util.Map;

public class Optional02ifPresent {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));

        //O Optional tem um método que pode verificar se tem algo presente dentro dele e se tiver recebe  uma lambda
        //Como é o proprio optional que faz a verificação no retorno do método eu posso encadear a chamada
        p.getNameByID(4).ifPresent(n -> System.out.println(n.toUpperCase()));


        System.out.println(p);
    }
}
