package lambdaOperacoesCollectionsAPI.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Map<String, Integer> maps = new HashMap<>();

    //O método computeIfAbsent permite calcular um valor associado a uma chave específica, caso essa chave ainda não esteja presente no mapa.
    //Se a chave já estiver presente, o método retorna o valor associado a ela sem fazer qualquer cálculo adicional.
    public int get(String s){
        //Metodo recebe uma key e uma Function, na Function temos a funcao de retornar algo relacionado a chave.
        return maps.computeIfAbsent(s, v -> {
            System.out.println("Computing value for: " + s);
            return v.length();
        });
    }

}
