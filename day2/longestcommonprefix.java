

// longest common prefix among set of strings

public class longestcommonprefix {
    

    static int longest2(String[] s) {
        int min = s[0].length();
        for (int i = 1; i < s.length; i++) {
            if (min > s[i].length()) {
                min = s[i].length();
            }
        }

        
        int flag;
        while (true) {
            flag = 0;
            for (int i = 0; i < s.length - 1; i++ ) {
                if (s[i].substring(0, min) != s[i+1].substring(0, min)) {
                    min--;
                    
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return min;
        

    }

    static int longest(String[] s) {

        int min = s[0].length();
        for (int i = 1; i < s.length; i++) {
            if (min > s[i].length()) {
                min = s[i].length();
            }
        }

        int c = 0;
        char ch = s[0].charAt(0);
        int ind = 0;
        int flag = 0;
        while (true) {
            for (int i = 1; i < s.length; i++) {
                if(s[i].charAt(ind) == ch) {
                    flag =  1;
                }
                else{
                    return c;
                }
            }
            if (flag == 1) {
                c++;
                flag = 0;
            } 
            ind++;
            ch = s[0].charAt(ind);
            if (ind == min) {
                break;
            }
        }
        return c;

    }

    public static void main(String[] args) {

    
        String[] s = {"flower", "flow", "flowight"};

        // output = fl;

        int l = longest(s);
        for (int i = 0; i < l; i++) {
            System.out.print(s[0].charAt(i));
        }

    }
}
