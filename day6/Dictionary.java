

import java.util.Hashtable;


public class Dictionary {
    
    static String getMeaning(Hashtable<String, String> dictionary, String word) {

        return dictionary.get(word);

    }

    static void getAll(Hashtable<String, String> dictionary) {
        for (String word: dictionary.keySet()) {
            System.out.println("word : " + word + " and meaning: " + dictionary.get(word));
        }
    }

    public static void main(String[] args) {
        
        Hashtable<String, String> dictionary = new Hashtable<String, String>();


        dictionary.put("Apple", "It is a fruit");
        dictionary.put("Deminish", "To disappear");
        dictionary.put("void", "It is a keyword");

        System.out.println("Meaning of the Deminish : " + dictionary.get("Deminish"));
        System.out.println(getMeaning(dictionary, "void"));


        getAll(dictionary);

    }

}
