package lambdaTransformer;

public class AppCalc05 {

    public static void main(String[] args) {

        Transformertext05 t5 = s -> s.trim();

        print(t5, "   java rocks   ");

        //Dentro dos blocos é possível criar variáveis, desde que no final voce retorne o que método pedi
        Transformertext05 t6 = x -> {
           char c[] = x.toCharArray();

           StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c.length; i += 2 ) {
                sb.append(c[i]);
            }

            //A partir do momento que voce usa chaves, voce deve colocar o return.
            return sb.toString();

        };

        print(t6, "Rafael");


        print(s -> {
                    char[] array = s.toCharArray();
                    StringBuilder sd = new StringBuilder();
                    for (int i = 0; i < array.length; i += 2) {
                        sd.append(array[i]);
                    }
                    return sd.toString();
                }
        , "JAVA COMPLETE EDITION");


    }

    private static void print(Transformertext05 text, String textPrint){
        System.out.println(text.textTransformer(textPrint));
    }

}
