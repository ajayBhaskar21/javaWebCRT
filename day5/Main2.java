

import java.util.*;

class Student {

    LinkedList<String> name;
    LinkedList<double> grade1;
    LinkedList<double> grade2;
    LinkedList<double> grade3;
    

    Student () {
        this.name = new Queue<>();
        this.grade1 = new Queue<>();
        this.grade2 = new Queue<>();
        this.grade3 = new Queue<>();
    }

    public void addStudent(String name, double d1, double d2, double d3) {

        
        name.offer(name);
        grade1.offer(d1);
        grade2.offer(d2);
        grade3.offer(d3);
            
        System.out.println("Student added");
    }

    public void getDetails(Student students) {

        

    }


}


public class Main2 {



    public static void main(String[] args) {


        Student students = new Student();

        students.addStudent("bot1", 90, 90, 90);
        




    }
    
}
