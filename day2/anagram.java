
import java.util.*;

public class anagram {


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        for (int i = 0; i < a.length(); i++) {
            if (ac[i] != bc[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String a = "listen";
        String b = "SILENT";
        System.out.println(isAnagram(a, b));


    }    
}
