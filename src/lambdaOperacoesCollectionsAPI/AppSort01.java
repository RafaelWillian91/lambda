package lambdaOperacoesCollectionsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AppSort01 {

    public static void main(String[] args) {

        var alphabet = new ArrayList<Character>(Arrays.asList('A', 'B', 'F', 'E', 'I', 'D','G', 'H', 'C'));
        System.out.println(alphabet);
        alphabet.sort((n1, n2) -> n1.compareTo(n2));
        System.out.println(alphabet);
        alphabet.sort((n1, n2) -> -n1.compareTo(n2));
        System.out.println(alphabet);

        //O método Comparator.naturalOrder() foi introduzido no Java 8.
        //Antes dessa versão, precisavamos escrever o próprio código para obter uma ordenação natural dos elementos usando o Comparator
        alphabet.sort(Comparator.naturalOrder());
        //assim como outros
        alphabet.sort(Comparator.reverseOrder());

    }
}
