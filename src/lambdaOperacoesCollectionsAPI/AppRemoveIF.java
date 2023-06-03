package lambdaOperacoesCollectionsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppRemoveIF {

    public static void main(String[] args) {

        var letters = new ArrayList<Character>(Arrays.asList('a', 'B', 'c', 'D','e'));

        letters.add('F');
        System.out.print(letters + "\n");
//
//        Iterator<Character> iterator = letters.iterator();
//
//        while (iterator.hasNext()){
//            char c = iterator.next();
//            if(Character.isLowerCase(c)){
//                iterator.remove();
//            }
//        }

        //Toda Colecao tem o método chamado removeIf que recebe uma functional interface predicate
       // letters.removeIf((n) -> Character.isLowerCase(n));

        //Devido a ter apenas um parametro e o mesmo é usado para implementacao da interface funcional, podemos usar método Reference
        //removeIf tambem retorna um booleano indicando se o elemento foi removido ou não
        letters.removeIf(Character::isLowerCase);

        System.out.println(letters);

        }


    }
