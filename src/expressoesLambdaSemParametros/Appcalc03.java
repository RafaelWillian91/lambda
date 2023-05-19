package expressoesLambdaSemParametros;

public class Appcalc03 {

    public static void main(String[] args) {

        //Mais verboso
        TextProvider03 tx = new TextProvider03() {
            @Override
            public String getText() {
                return "FOI";
            }
        };

        textPrint(tx);


        textPrint(new TextProvider03() {
            @Override
            public String getText() {
                return "Ola";
            }
        });

        //Com Expressão Lambda

        //A expressão lambda compativel com um método que não tem parâmetro é um colchetes vazio ().
        textPrint(() -> "Ola mundo" ); //String getText(); metodo da interface funcional
        textPrint(() -> "Expressão Lambda é o Hype");

    }

    private static void textPrint(TextProvider03 text){
        System.out.println(text.getText());
    }
}
