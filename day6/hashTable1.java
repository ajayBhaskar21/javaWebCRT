
import java.util.Hashtable;

public class hashTable1 {

    public static void main(String[] args) {
        

        Hashtable<String, Integer> a = new Hashtable<>();

        a.put("Apple", 30);
        a.put("Orange", 50);
        a.put("Watermelon", 100);


        System.out.println(a.get("Watermelon"));

        a.remove("Orange");

        System.out.println(a.containsKey("Apple"));

        // Iterate over key value pairs.

        for (String key: a.keySet()) {
            System.out.println("key : " + key + " and value : " + a.get(key));
        }


    }
    
}
