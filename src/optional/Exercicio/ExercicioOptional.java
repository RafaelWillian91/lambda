package optional.Exercicio;

import java.util.Optional;

public class ExercicioOptional {

    public static void main(String[] args) {

        PhoneBook p1 = PhoneBook.getInstance();
        p1.add(33247182, "Rafael");
        p1.add(992568271, "Josiane");
        p1.add(988067626, "Wanderley");

        //Duas abordagens para trabalhar com Optional

        Integer phone = p1.getCad("Raafael").orElseThrow(IllegalArgumentException::new);

        p1.getCad("Josianes").ifPresentOrElse(number -> System.out.println(number),
                //Quando for um throw a lambda expression tem que ter o uso das chaves.
                () -> {throw new IllegalArgumentException(); }
                );

    }
}
