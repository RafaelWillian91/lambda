package lambdaOperacoesCollectionsAPI;

import UsandoMethodReferencesParte3.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AppSort02 {

    public static void main(String[] args) {

        var listPeople = new ArrayList<People>(Arrays.asList(
                new People("Rafael", 32),
                new People("Pedro", 23),
                new People("Paulo", 77),
                new People("Maria", 55),
                new People("Rafael", 22),
                new People("Amanda", 23)
        ));

        listPeople.forEach(n -> System.out.println(n.name + " - " + n.idade));
        System.out.println("------------------------------------------------");


        //Ordenação por nome
        //listPeople.sort((n1, n2) -> n1.name.compareTo(n2.name));
        //listPeople.forEach(n -> System.out.println(n.name));

        //Tudo pode ser substituido com Comparator.comparing que recebe uma Function.
        //Person vai ser transformado em um Comparator de acordo com a Function
        //listPeople.sort(Comparator.comparing(p1 -> p1.name));
        //Devido ao método invocado ser um Comparator a Function é parametrizada no retorno com Um Comparator e Person no primeiro parametro
        listPeople.sort(Comparator.comparing(People::name));
        listPeople.sort(Comparator.comparing(p -> p.name));
        listPeople.forEach(n -> System.out.println(n.name));


        System.out.println("-------------------------------");
        //Para enverter a lista podemos usar um reversed() encadeado
        listPeople.sort(Comparator.comparing(People::name).reversed());
        listPeople.forEach(n -> System.out.println(n.name));

        //theComparing desempata o criterio de ordenão por uma segunda comparacao.
        System.out.println("---------------------------------");
        listPeople.sort(Comparator.comparing(People::name).thenComparing(People::idade));
        listPeople.forEach(n -> System.out.println(n.name));
    }

    record People(String name, int idade){

    }
}
