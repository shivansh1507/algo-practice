/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA


*/
import java.util.Scanner;

public class prog21
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();
		
		System.out.println("** Printing the pattern... **");
		
		for (int i = 0; i <= rows; i++) 
		{ 
			int alphabet = 65; 
			for (int j = rows; j > i; j--) 
			{ 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) 
			{ 
				System.out.print((char) (alphabet + k)); 
			} 
			for (int l = i - 1; l >= 0; l--) 
			{ 
				System.out.print((char) (alphabet + l)); 
			} 
			System.out.println(); 
		}
	}
}