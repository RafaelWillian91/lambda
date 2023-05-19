package expressoesLambdaSemParametros;

import org.w3c.dom.ls.LSOutput;

public class Appcalc04 {

    public static void main(String[] args) {

        System.out.println("ola mundo lambda");

        textTransfomed((r) -> r.toUpperCase(), "rafael");

        //Caso seja apenas 1 parametro os parenteses são opicionais

        textTransfomed(r -> new String().toUpperCase(), "rafael willian");

        //O retorno de StringBuilder é uma String, então esta de acordo com o método funcional
        textTransfomed(r -> new StringBuilder(r).reverse().toString(), "rafael willian");

    }

    public static void textTransfomed(Transformetext04 text, String textTransf){
        System.out.println(text.textTransform(textTransf));
    }

}
