package exercicioLambda02;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        run(null , s -> System.out.println("My language is java"), () -> System.out.println("My language is none"));

    }

    private static void run(String s, CodeWithParam codeIfnotNull, CodeNull codeNull){

        if(s != null){
            codeIfnotNull.execute(s);
        }else {
            codeNull.execute();
        }
    }

}

@FunctionalInterface
interface CodeWithParam {

    void execute(String s);

}

@FunctionalInterface
interface CodeNull {

    void execute();

}
