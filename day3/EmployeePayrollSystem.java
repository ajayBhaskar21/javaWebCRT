
import java.util.*;


public class EmployeePayrollSystem {
    

    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;
    private int hoursWorked;
    private int projectsDone;

    EmployeePayrollSystem(int employeeId, String employeeName, 
    String designation, double salary, int hoursWorked, int projectsDone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.projectsDone = projectsDone;
    }


    public void monthlySalary() {
        if (hoursWorked >= 240) {
            System.out.println(employeeName + " is given 1,00,000");
        }
        else if (hoursWorked >= 200) {
            System.out.println(employeeName + " is given 80,000");
        }
        else  {
            System.out.println(employeeName + " is given 50,000");
        }  
    }


    public void raise() {

        if (projectsDone > 5) {
            salary += 50000;
            System.out.println("After salary hike " + employeeName +" total salary is " + salary);
        }
        else{
            System.out.println(employeeName + " got no salary hike and total salary is " + salary);
        }

    }

    public void payroll_reports() {
        System.out.println();
    }


    public static void main(String[] args) {
        
        //ArrayList<EmployeePayrollSystem> employee = new ArrayList<EmployeePayrollSystem>();

        EmployeePayrollSystem employee1 = new EmployeePayrollSystem(10, "ajay", 
        "Manager", 100000, 260, 4);
        EmployeePayrollSystem employee2 = new EmployeePayrollSystem(122, "krishna", 
        "Ceo", 100000, 20, 6);
        
        employee2.monthlySalary();
        employee1.monthlySalary();
        employee1.raise();
        employee2.raise();


    }



}
