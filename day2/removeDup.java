import java.util.ArrayList;

public class removeDup {
    

    static void remdup (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                a[i] = -1;
            }
        }

    }

    public static void main(String[] args) {
        

        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(4);

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) == a.get(i + 1)) {
                a.remove(i);
                i--;
            }
        }
        System.out.println(a);

        int[] a1 = {1,1,2,2,3,3,3,4};
        remdup(a1);
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != -1) {
                System.out.print(a1[i] + " ");
                
            }
        }

    }


}
