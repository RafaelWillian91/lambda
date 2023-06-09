package optional;

import java.util.Optional;

public class Optional007orElsexorElseGet {

    public static void main(String[] args) {

        //O orElse sempre é avaliado, mesmo que exista algo no Container de Optional, então uma operacao de I/O iria ter
        //Um custo muito alto de produtividade.
         String name = Optional.of("R").orElse(get());
         System.out.println(name);

        //orElseGet não é execultado e nem verificado caso a primeira condicao seja satisfeita.
        String name2 = Optional.of("J").orElseGet(() -> get());
        System.out.println(name2);

    }

    private static String get() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Chamada";
    }
}
