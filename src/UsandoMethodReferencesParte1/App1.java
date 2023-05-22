package UsandoMethodReferencesParte1;

public class App1 {

    public static void main(String[] args) {


        //transformerAndprint(s -> s.toUpperCase(), "java");

        //Quando existe apenas um parâmetro, uma linha e o parâmetro é usado na linha.:: Podemos usar o método Reference
        //Referência do método dentro dele mesmo.
        transformerAndprint(String::toUpperCase, "java");
        transformerAndprint(String::toLowerCase, "Rafael");


    }

    private static void transformerAndprint(TextTransformer textTransformer, String s){
        System.out.println(textTransformer.textTransformeted(s));
    }


}
