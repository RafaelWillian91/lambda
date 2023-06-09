package optional;

import java.util.Map;
import java.util.Optional;

public class Optional01 {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));


        Optional <String> op = p.getNameByID(6);

        if(op.isPresent()){
            //O get retira o que está dentro do Optional e assim posso chamar os métodas da classe Subjacente
            System.out.println(op.get().toUpperCase());
        }

        System.out.println(p);
    }
}
