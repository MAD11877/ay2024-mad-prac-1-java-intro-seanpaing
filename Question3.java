import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
    int num = in.nextInt();

    // Calculate the square of the entered integer
    int result = num*num;
    String strResult = String.valueOf(strResult);

    // Print out the result
    System.out.println(result);
    
    // Close the Scanner object
    in.close();
  }
}
