import java.io.*;

public class Input {
    public static void main(String[] args) {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some text:");
        try {
            String userInput = reader.readLine();
            PrintWriter writer = new PrintWriter(System.out);
            writer.println("You entered: " + userInput); 
            writer.flush();
            writer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}