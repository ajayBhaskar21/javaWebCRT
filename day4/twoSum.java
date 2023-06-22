import java.util.ArrayList;

class twoSum {

    //static void findTwo(int[] n, )
    public static void main(String[] args) {
        
        int[] num = {2, 3, 4, 5};
        int target = 7;
        
        ArrayList<Integer> ind = new ArrayList<>();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    ind.add(i);
                    ind.add(j);
                }   
            }
        }
        System.out.println(ind);


    }
}