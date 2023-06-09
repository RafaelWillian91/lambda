package optional;

import java.util.Map;
import java.util.Optional;

public class Optional03ifPresentOrElse {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));

        //existe a possibilidade de entrar em um bloco else
        //a diferenca entre o ifPresent e o ifPresentOrElse é que o ifPresentOrElse recebe dois parametros
        //o primeiro é o que deve ser execultado e o segundo o que executar caso nao satisfaca a condicao
        p.getNameByID(4).ifPresentOrElse(n -> System.out.println(n.toUpperCase()), () -> System.out.println("ID not found") );
        

    }

}
