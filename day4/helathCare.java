
import java.util.*;
class patientNotFoundException extends Exception {
    patientNotFoundException(String s) {
        super(s);
    }
}
public class helathCare {
    private int patientId;
    private String patientName;
    helathCare(int id, String name) {
        patientId = id;
        patientName = name;
    }

    public String getPatientName () {
        return patientName;

    }

    public int getPatientId() {
        return patientId;
        
    }

    public void checkPatient(boolean check) throws patientNotFoundException {
        if (check == false) {
            throw new patientNotFoundException("Patient not found!");
        }
    }
    public boolean findName(ArrayList<helathCare> arr){
        System.out.println("Enter Patient Id: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Patient id = " + this.patientId + " and Patient Name = " + this.patientName);
            if (arr.get(i).patientId == id) {      
               flag = 1;
            }
        }
        if (flag == 0) 
        {
            try{
                checkPatient(false);
            }  
            catch(patientNotFoundException e) {
                System.out.println("Error : " + e.getMessage());
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<helathCare> patient = new ArrayList<>();
        patient.add( new helathCare(20, "bot1"));
        patient.add( new helathCare(21, "bot2"));
        patient.add( new helathCare(22, "bot3"));
        if (patient.get(2).findName(patient)) {
            System.out.println("Patient found");
        }
        else {
            System.out.println("Please verify patient details");
        }

    }

    
}
