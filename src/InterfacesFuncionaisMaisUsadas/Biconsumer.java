package InterfacesFuncionaisMaisUsadas;

import java.util.List;
import java.util.function.BiConsumer;

public class Biconsumer {


    public static void main(String[] args) {

        //BiConsumer é a mesma analogia, mais ao invês de receber um parametro ele recebe dois. Parametrizáveis.
        var list = List.of("A", "B", "C", "D");
        biconsumer(list, (c, d) -> System.out.println(c + " -> " + d));

        System.out.println("-------------------------------------------------");

        var list2 = List.of(13, 2, 54, 4, 5, 66, 7, 8, 8, 90);
        biconsumer2(list2, (j, k) -> System.out.println(j + " -> " + k));

        System.out.println("------------------------------------------");

        //Sem Lambda. Para comparação
        myClass myClass = new myClass();
        biconsumer3(list2, myClass);
    }

    //Com Lambda e classe Funcional Biconsumer
    private static void biconsumer(List<String> list, BiConsumer<Integer, String> biConsumer) {

        for (int i = 0; i < list.size(); i++) {
            biConsumer.accept(i, list.get(i));
        }

    }

    //Com Lambda e classe Funcional Biconsumer
    private static void biconsumer2(List<Integer> list, BiConsumer<Integer, Integer> biConsumer) {

        for (int i = 0; i < list.size(); i++) {
            biConsumer.accept(i, list.get(i));
        }

    }

    //Codigo executado sem lambda, para exemplo.
    private static void biconsumer3(List<Integer> list, BiConsumer<Integer, Integer> myBiConsumer) {
        for (int i = 0; i < list.size(); i++) {
            myBiConsumer.accept(i, list.get(i));
        }
    }


}

//Exemplo para comparacao sem Lambda.
class myClass implements  BiConsumer<Integer, Integer>{

    @Override
    public void accept(Integer integer, Integer integer2) {
        System.out.println(integer + " -> " + integer2);
    }

}