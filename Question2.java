import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter their height
    
        double height = in.nextDouble();
        
        // Prompt the user to enter their weight

        double weight = in.nextDouble();
        
        // Calculate BMI using the formula: weight / (height * height)
        double bmi = weight / (height * height);
        
        // Print the calculated BMI
        System.out.println(bmi);
        
        // Close the Scanner object
        in.close();
    }
}
