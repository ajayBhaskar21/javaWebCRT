import java.util.*;


public class Llist {



    public static void main(String[] args) {
        
        LinkedList<String> a = new LinkedList<>();


        a.add("1");
        a.add("2");
        a.add("3");
        a.add(1, "5");

        System.out.println(a);

        a.set(3, "100");
        a.remove(0);

        System.out.println(a);

        for (String i : a) {
            System.out.print(i + " ");

        }
        System.out.println();


        

    }
    
    
}
