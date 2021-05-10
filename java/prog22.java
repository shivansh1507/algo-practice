/*
    A 
   B C 
  D E F 
 G H I J 
K L M N O

*/
import java.util.Scanner;

public class prog22
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
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int alphabet = 65; 
			for (int k = i; k >= 0; k--) 
			{ 
				System.out.print((char) (alphabet + k) + " "); 
			}
			System.out.println(); 
		}
	}
}