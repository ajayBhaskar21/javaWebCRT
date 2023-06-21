import java.util.ArrayList;

class longestSubstring {


    static int longestSub(String s) {
        int l = 0;
        int max = 0;
        ArrayList<Character> st = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            l = 0;
            st.add(s.charAt(i));
            l++;
            int j = i + 1;
            while (true) { 
                if (j == s.length()) {
                    break;
                }
                if (st.contains(s.charAt(j))) {
                    break;
                }
                else {
                    st.add(s.charAt(j));
                    j++;
                    l++;
                }
            }
            st.removeAll(st);
            if (max < l) {
                max = l;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        
        String s = "pwwekwp";
        System.out.println(longestSub(s));

    }
}