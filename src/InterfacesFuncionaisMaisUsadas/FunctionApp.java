package InterfacesFuncionaisMaisUsadas;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        //Recebe um tipo e retorna outro Tipo, ou até o mesmo
        //Muito usada em Mapeamento
        //O primeiro parametro é o Tipo de dado e o segundo é o Retorno
       // Person p1 = new Person("Rafael", "Willian");
        Person p2 = new Person("Rafael", "Willian");
        System.out.println(transformer(p2, person -> person.getFirstName()));
        System.out.println(transformer(p2, Person::getLastName));
        System.out.println(transformer(p2, person -> person.getFirstName() + " " + person.lastName));
    }

    //O retorno é de acordo com o segundo dado Passado.
    private static String transformer (Person person, Function<Person, String> personStringFunction){
        return personStringFunction.apply(person);
    }

     static class Person{

        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }



        public String getLastName() {
            return lastName;
        }
    }
}
