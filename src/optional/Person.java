package optional;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Person {

        private  final Map<Integer, String> map;

        public Person(Map <Integer, String> maps){
            this.map = maps;
        }



    public Map<Integer, String> getMap() {
        return map;
    }

    //Para evitar null, foi usado um optional
    //Optional é um container que pode ou nao ter algo dentro.
    //Caso tenha certeza que não retornará null, podemos usar o método Optional.of, senao usamos Optional.ofNullable
    public Optional<String> getNameByID(int id){

            for(Map.Entry<Integer, String> entry: map.entrySet()){
                if(entry.getKey().equals(id)){

                    return Optional.of(entry.getValue());

                }
            }
            return Optional.empty();//Caso nao tenha o retorna é um Optional vazio ao invés de um null
        }

    @Override
    public String toString() {
        return "Person{" +
                "map=" + map +
                '}';
    }
}