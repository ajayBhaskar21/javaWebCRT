
class Ani {


    private String Door;
    private String Tv;

    Ani (String Door, String Tv) {
        this.Door = Door;
        this.Tv = Tv;
    }


    protected void print() {
        System.out.println("Door is " + Door + " and Tv is turned " + Tv);
    }

}


public class class1 {

    public static void main(String[] args) {
        

        Ani obj = new Ani("Opened", "Off");

        obj.print();

    }

    
}
