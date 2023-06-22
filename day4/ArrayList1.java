
import java.util.*;

import javax.sound.midi.SysexMessage;

public class ArrayList1 {


    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer > arr = new ArrayList<Integer>(n);
        arr.add(20);
        arr.add(30);

        arr.add(1, 1010);

        System.out.println(arr);

        System.out.println(arr.get(2));

        System.out.println("remove = " + arr.remove(2));

        arr.add(1);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

        arr.set(1, 10000);
        arr.remove(arr.get(1));

        System.out.println(arr);


        ArrayList<String> as = new ArrayList<>();

        as.add("hello");
        as.add("hell");

        System.out.println(as);
        as.remove("hell");

        System.out.println(as);

        for (int i = 0;  i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        as.add("world");

        for (String i: as){
            System.out.print(i + " ");
        }


    }
    
}
