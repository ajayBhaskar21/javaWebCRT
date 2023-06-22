
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exception2 {
    

    public static void main(String[] args) {
        
        String inputFile = "input.txt";


        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException e) {
            System.out.println("enter " + e.getMessage());
        }

    }
}
