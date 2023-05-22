package UsandoMethodReferencesParte3;

public class App03 {

    public static void main(String[] args) {


        createrPrint(s -> new Person(s), "Rafael");

        //Temos uma expressão lambda que tem: uma linha, um parâmetro que está sendo usado no construtor de Person
        //Temos um for candidato ao Method Reference

        createrPrint(Person::new, "Josiane");

    }

    public static void createrPrint(PersonCreator p, String name){
        System.out.println(p.creator(name));
    }
}
