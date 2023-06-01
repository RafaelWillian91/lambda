package InterfacesFuncionaisMaisUsadas;

import java.util.Random;
import java.util.function.Supplier;

public class Supplierapp {

    public static void main(String[] args) {

        //Interface Funcional que retorna um tipo parametrizavel
        System.out.println(supl( () -> new Random().nextInt(1, 100)));

    }

    private static Integer supl(Supplier<Integer> supplier){
        return supplier.get();
    }
}
