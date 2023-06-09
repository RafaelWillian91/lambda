package optional.Exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class PhoneBook {

        private static final Map<Integer, String> map =  new HashMap<>();

        private static PhoneBook phoneBook;

        private PhoneBook(){

        }

        public void add(int number, String name){
                map.put(number, name);
        }

        public static PhoneBook getInstance(){
                if(phoneBook == null){
                        phoneBook = new PhoneBook();
                }
                return phoneBook;
        }

        public Optional<Integer> getCad(String name) {

            for (var entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    return Optional.of(entry.getKey());
                }
            }
            return Optional.empty();
        }

        @Override
        public String toString() {
               StringBuilder sb = new StringBuilder();
               sb.append("Phones: \n" );
               for (var phones: map.entrySet()){
                        sb.append("Name: " + phones.getValue());
                        sb.append(" - Phone: " + phones.getKey() + "\n");
               }
                return sb.toString();
        }
}
