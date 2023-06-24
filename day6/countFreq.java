
import java.util.*;
import java.io.*;

public class countFreq {
    public static void main(String[] args) {
        
/*
        // File path is passed as parameter
        File file = new File(
            "C:\\Users\\ADMIN\\Desktop\\4010\\java\\day6\\tasks.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        String txt = "";
        while ((st = br.readLine()) != null)
            txt += st;
 
            // Print the string
            //System.out.println(st);

*/


        String txt = "write a program using hash table or hash map " + 
                "to count the occurence of words in a text document. The words " + 
                "can be used as keys and corresponding values be the Frequencies.";

        String[] words = txt.split(" ");

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            if (words[i].contains(",")) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) != ',') {
                        temp += words[i].charAt(j);
                    }
                }
                words[i] = temp;  
            }
            else if (words[i].contains(".")) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) != '.') {
                        temp += words[i].charAt(j);
                    }
                }
                words[i] = temp;       
            }
        }

/*
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
*/

        Hashtable<String, Integer> map = new Hashtable<String, Integer>();

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            }
            else {
                map.put(words[i], 1);
            }
        }
        
        for (String key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        
    }
}
