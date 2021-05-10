/*
    A 
   C B 
  D E F 
 J I H G 
K L M N O
*/

import java.util.Scanner;

public class prog23
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();
		
		int currentRow = 1; 
		int counter = 1; 
		int alphabet = 65;
		
		System.out.println("** Printing the pattern... **");
		
		for (int i=1; i<= rows; i++) 
		{ 
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			if (i % 2 == 0) 
			{ 
				int reverse = currentRow + counter - 1; 
				for (int k = 0; k<i; k++) 
				{ 
					System.out.print((char) (reverse + alphabet -1)+" "); 
					reverse--; 
					counter++; 
				} 
			} 
			else 
			{ 
				for (int k = 1; k<=i; k++) 
				{ 
					System.out.print((char) (counter + alphabet - 1) +" "); 
					counter++; 
				} 
			} 
			System.out.println(); 
			currentRow++; 
		}
	}
}