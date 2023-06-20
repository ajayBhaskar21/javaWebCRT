
import java.util.*;


public class countvowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        String s = "a Abv ei O o u z x ";
        
        s = s.toLowerCase();
        char[] seq = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int vc = 0;
        int cc = 0;
        for (Character i : seq) {
            if (i >= 97 && i <= 122){
                if (vowels.contains(i)) {
                    vc++;
                }
                else{
                    cc++;
                }
            }
            
        }
        System.out.println("vowel count : " + vc);
        System.out.println("consonant count : " + cc);

    }
}
