package lambdaOperacoesCollectionsAPI;

import java.util.Map;

public class AppForeach002 {

    public static void main(String[] args) {

        var people = Map.of(
                1, "Rafael",
                2 ,"Josi",
                3, "Henrique",
                4, "Wanderlei"
        );

//        for (int n : people.keySet()){
//            System.out.println(n);
//        }

        people.keySet().forEach(n -> System.out.println(n));

        people.values().forEach(n -> System.out.println(n));

        //forEach que consome dois valores BiConsumer
        people.forEach((k,v) -> System.out.println(k + " => " + v));


    }
}
