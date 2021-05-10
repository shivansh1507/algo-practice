/*
    A 
   A A 
  A B A 
 A C C A 
A D F D A

*/
import java.util.Scanner;

public class prog20
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();
		
		System.out.println("** Printing the pattern... **");
		
		for (int i = 1; i <= rows; i++) //i = 3
		{ 
			int alphabet = 65; 
			for (int j = rows; j > i; j--) 
			{ 
				System.out.print(" "); 
			} 
			int temp = 1; 
			for (int k = 1; k <= i; k++)//k = 1, k= 2
			{ 
				System.out.print((char) (alphabet - 1 + temp) + " "); //A B A
				temp = temp * (i - k)/k; //1 * 3-2/1=1
			} 
			System.out.println(); 
		}
	}
}