

import java.util.*;
class Student {

    Queue<String> name;
    Queue<Double> grade1;
    Queue<Double> grade2;
    Queue<Double> grade3;
    
    Student () {
        this.name = new LinkedList<>();
        this.grade1 = new LinkedList<>();
        this.grade2 = new LinkedList<>();
        this.grade3 = new LinkedList<>();
    }

    public void addStudent(Student students, String name, double d1, double d2, double d3) {
        students.name.offer(name);
        students.grade1.offer(d1);
        students.grade2.offer(d2);
        students.grade3.offer(d3);
    }

    public void calculateAverage(Student students, int totalStudents) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = in.nextLine();
        boolean found = false;
        for (int i = 0; i < totalStudents; i++) {
            if (students.name.peek().equals(name)) {
                found = true;
                System.out.println("Average grade : " + 
                    ((students.grade1.peek() + students.grade2.peek() + students.grade3.peek()) / 3));
                break;
            }
            addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());
        }
        if (!found){
            System.out.println("Student not found");
        }
    }

    public void highestGradeStudent(Student students, int totalStudents) {

        String checkName = students.name.peek();
        double max = (students.grade1.peek() + students.grade2.peek() + students.grade3.peek()) / 3 ;
        addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());

        for (int i = 0; i < totalStudents - 1; i++) {
            double calculated = (students.grade1.peek() + students.grade2.peek() + students.grade3.peek()) / 3 ;
            if (max < calculated) {
                max = calculated;
                checkName = students.name.peek();
            }
            addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());
        }
        System.out.println("highestGradeStudent : " + checkName);
    }

    public void lowestGradeStudent(Student students, int totalStudents) {
        String checkName = students.name.peek();
        double min = (students.grade1.peek() + students.grade2.peek() + students.grade3.peek()) / 3 ;
        addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());

        for (int i = 0; i < totalStudents - 1; i++) {
            double calculated = (students.grade1.peek() + students.grade2.peek() + students.grade3.peek()) / 3 ;
            if (min > calculated) {
                min = calculated;
                checkName = students.name.peek();
            }
            addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());
        }
        System.out.println("lowestGradeStudent : " + checkName);
    }

    public void getDetails(Student students, int totalStudents) {

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Student name: " + students.name.peek());
            System.out.println("Student grade1: " + students.grade1.peek());
            System.out.println("Student grade2: " + students.grade2.peek());
            System.out.println("Student grade3: " + students.grade3.peek());
            
            addStudent(students, students.name.poll(), students.grade1.poll(), 
                students.grade2.poll(), students.grade3.poll());
        }
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student students = new Student();
        int totalStudents = 0;
        students.addStudent(students, "bot1", 90, 90, 90);
        totalStudents ++;
        students.addStudent(students, "bot2", 50, 25, 41);
        totalStudents ++;
        students.addStudent(students, "bot3", 68, 79, 26);
        totalStudents ++;
        while (true) {
            System.out.println("\n1. addStudent");
            System.out.println("2. calculate avg");
            System.out.println("3. find highest grade student");
            System.out.println("4. find lowest grade student");
            System.out.println("5. display details");
            System.out.println("6. exit\n");
            System.out.print("Enter your choice: ");
            int check = in.nextInt();
            if (check == 1) {
                System.out.print("Enter student details: ");
                String enterName = in.next();
                Double g1 = in.nextDouble();
                Double g2 = in.nextDouble();
                Double g3 = in.nextDouble();
                students.addStudent(students, enterName, g1, g2, g3);
                //students.addStudent(students, "bot99", 58, 49, 86);
                totalStudents ++;
                System.out.println("Student added");
            }
            else if (check == 2) {
                students.calculateAverage(students, totalStudents);
            }
            else if (check == 3) {
                students.highestGradeStudent(students, totalStudents);
            }
            else if (check == 4) {
                students.lowestGradeStudent(students, totalStudents);
            }
            else if (check == 5) {
                students.getDetails(students, totalStudents);
            }
            else if (check == 6) {
                System.out.println("Program exited");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}
