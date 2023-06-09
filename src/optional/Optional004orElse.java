package optional;

import java.util.Map;

public class Optional004orElse {

    public static void main(String[] args) {

        Person p = new Person(Map.of(
                1, "Rafael",
                2, "Josiane",
                3, "Alessandra",
                4, "Maria"
        ));

        //O método .get() tira o que está no container, se for String abre os métodos da classe.
        String name = p.getNameByID(2).get();
        System.out.println(name);


        //o método orElse() da a possibilidade de colocar um outro valor ali caso nao exista
        String naoOrelse = p.getNameByID(33).orElse("Nao encontrado");
        System.out.println(naoOrelse);

        //Suplier não receba parametro e retorna um parametro parametrizado
        //ao usar o orElseGet podemos passar uma expressao lambda inteira antes de retornar, limitacao do .orElse().
        String naoOrelse2  = p.getNameByID(12).orElseGet(() -> "Valor não encontrado");
        System.out.println(naoOrelse2);

        //outra solucao para evitar o null e lancar um
        String naoOrelse3 = p.getNameByID(4).orElseThrow();
        System.out.println(naoOrelse3);

        //Para lancar outro tipo de Exceção
        String naoOrelse4 = p.getNameByID(42).orElseThrow(() -> new RuntimeException("No element"));
        System.out.println(naoOrelse4);
       // p.getNameByID(42).orElseThrow(RuntimeException::new);


        //Esses métodos abrem possibilidades para não existir valor de retorno.
            }
}
