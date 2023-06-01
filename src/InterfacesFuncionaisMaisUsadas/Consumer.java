package InterfacesFuncionaisMaisUsadas;

public class Consumer {

    public static void main(String[] args) {


        //Interface funcional que recebe um parametro e nao retorna nada
        //Aceita um generics, ou seja, esse parametro pode ser de qualquer tipo.
        java.util.function.Consumer c = d -> System.out.println(d);
        consum(10, c);

        consum2("Ola", d2 -> System.out.println(d2));

        consum2("Method Reference", System.out::println);

    }

    private static void consum(int n,  java.util.function.Consumer<Integer> c){
        for (int i = 0; i < n; i++) {
            c.accept(i);
        }
    }

    private static void consum2(String string,  java.util.function.Consumer s){
        s.accept(string);
    }

}
