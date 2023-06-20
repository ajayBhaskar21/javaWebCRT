class Student {

    
    Student (int id, String name) {
        System.out.println(id + " " + name);

    }
}


public class arr {


    public static void main(String[] args) {
        Student obj[] = new Student[3];
        obj[0] = new Student(1, "null");
        obj[1] = new Student(2, "bot");
        obj[2] = new Student(3, "bot3");



    }
    
}
