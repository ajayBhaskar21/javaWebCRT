import java.net.*;
import java.util.*;

public class ipAddress {
    public static void main(String[] args) throws UnknownHostException{
        //String s = "https://www.flipkart.com/";
        System.out.print("enter url : ");
        String s = new Scanner(System.in).nextLine();
        try {
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            System.out.println("IP Address of: " + ip);
        }
        catch (Exception e) {
            System.out.println("Invalid URL");
        }
    }
    
}
