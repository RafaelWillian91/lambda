package InterfacesFuncionaisMaisUsadas;

import java.util.function.BiFunction;

public class BifuncitonApp {

    //Interface funcional que rece 3 parametros e tem um retorno
    public static void main(String[] args) {

        System.out.println(combine(10, 20, (n1, n2) -> n1 + n2));


    }


    private static int combine(int n1, int n2, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(n1, n2);
    }
}
