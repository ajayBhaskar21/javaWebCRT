import javax.sound.midi.SysexMessage;

public class exceptionHandle {



    public static void main(String[] args) {
        

        try {
            System.out.println("Value = " + 1 / 0);
        }
        catch (Exception e) {
            System.out.println("division by zero gives an Exception");
        }
        finally {
            System.out.print("finally block");
        }


    }
    
}
