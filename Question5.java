import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the number of integers

        int count = in.nextInt();
        
        // Create an array to store the integers
        int[] numbers = new int[count];
        
        // Prompt the user to enter the integers and store them in the array
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }
        
        // Find the mode
        int mode = 0; // Initialize mode to 0
        int maxCount = 0; // Initialize maxCount to 0
        
        for (int i = 0; i < numbers.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = numbers[i];
            }
        }
        
        // Print the mode
        System.out.println( mode);
        
        // Close the Scanner object
        in.close();
    }
}
