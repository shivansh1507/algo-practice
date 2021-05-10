/*
	 1
    2 9
   3 8 10
  4 7 11 14
 5 6 12 13 15

*/

import java.util.Scanner;

public class prog14
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) 
			{ 
				if (k % 2 == 0) 
				{ 
					System.out.print(1 + k * rows - (k - 1) * k / 2 + i - k + " "); 
				} 
				else 
				{ 
					System.out.print(1 + k * rows - (k - 1) * k / 2 + rows - 1 - i + " "); 
				} 
			} 
			System.out.println(); 
		}
	}
}