
// left rotate 3 times
import java.util.*;

public class leftRotate {

    static void leftRot(String s) {
        char[] sch = s.toCharArray();
        int times = 3;
        while (times-- > 0) {
            char ch = sch[0];
            for (int i = 0; i < s.length() - 1; i ++) 
                sch[i] = sch[i + 1];
            sch[s.length() - 1] = ch;
        }
        System.out.println(String.valueOf(sch));
    }

    static void leftRot2 (String s) {
        int n = 3;
        System.out.println(s.substring(n) + s.substring(0, n));
    }

    public static void main(String[] args) {
        String s = "123456";
        // op : 456123
        leftRot(s);
        leftRot2(s);
    }
}
