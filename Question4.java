import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter an integer for the base of the triangle
        System.out.print("Enter an integer for the base of the triangle: ");
        int base = in.nextInt();
        
        // Loop for each row
        for (int i = base; i > 0; i--) {
            // Loop to print '*' for each column in the row
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing '*' for each row
            System.out.println();
        }
        
        // Close the Scanner object
        in.close();
    }
}