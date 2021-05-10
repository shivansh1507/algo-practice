/*
     5
    5 4
   5 4 3
  5 4 3 2
 5 4 3 2 1

*/
import java.util.Scanner;

public class prog4
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scan.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = rows; i >= 1; i--)
		{
			for (int j = rows; j >= 1; j--)
			{
				System.out.print(" ");
			}
			for (int k = rows; k >= i; k--)
			{
				System.out.print(k + " ");//k
			}
			System.out.println();
		}
	}
}