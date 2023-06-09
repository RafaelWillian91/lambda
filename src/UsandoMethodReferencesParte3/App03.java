package UsandoMethodReferencesParte3;

public class App03 {

    public static void main(String[] args) {

        PersonCreator p1 = new PersonCreator() {
            @Override
            public Person creator(String name) {
                return new Person(name);
            }
        };

        Person p2 = p1.creator("Anonymou");
        System.out.println(p2);



        //Com Lambda
        createrPrint(s -> new Person(s), "Rafael");



        //Temos uma expressão lambda que tem: uma linha, um parâmetro que está sendo usado no construtor de Person
        //Temos um for candidato ao Method Reference
        createrPrint(Person::new, "Josiane");

    }

    public static void createrPrint(PersonCreator p, String name){
        System.out.println(p.creator(name));
    }
}
