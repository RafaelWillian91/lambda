package exercicioLambda01;

public class Main {

    public static void main(String[] args) {

        repeat(6, i -> System.out.println("ola => " + i));

    }

    private static void repeat(int vezesEx, Function fun){

        for (int i = 0; i < vezesEx; i++) {
            fun.repeatFunction(i);
        }

    }

}

@FunctionalInterface
interface Function{

    void repeatFunction(int index);

}
